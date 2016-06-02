package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;

import model.Jogador;
import model.JogadorInfo;


public class LuceneApplication {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	private static FullTextEntityManager ftem;
	
	private static FullTextEntityManager getFullTextEntityManager(){
		if (ftem == null){
			ftem = Search.getFullTextEntityManager(em);
		}
		return ftem;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		if (em != null) {
			//Apagando todos os registros
		/*
			em.getTransaction().begin();
			em.createQuery("delete from Jogador").executeUpdate();
			em.getTransaction().commit();
			
			
			em.getTransaction().begin();
			
			Jogador jogador1 = new Jogador();
			jogador1.setNome("HELTON LEITE");
			jogador1.setTime("BOTAFOGO");
			jogador1.setAtual(-2.0F);
			jogador1.setJogadorInfo(JogadorInfo.REAL);
			em.persist(jogador1);
			
			Jogador jogador2 = new Jogador();
			jogador2.setNome("BRUNO");
			jogador2.setTime("SÃO PAULO");
			jogador2.setAtual(4.6F);
			jogador2.setJogadorInfo(JogadorInfo.REAL);
			em.persist(jogador2);

			
			Jogador jogador3 = new Jogador();
			jogador3.setNome("VILSON");
			jogador3.setTime("CORINTHIANS");
			jogador3.setAtual(7.4F);
			jogador3.setJogadorInfo(JogadorInfo.REAL);
			em.persist(jogador3);

			Jogador jogador4 = new Jogador();
			jogador4.setNome("PATRIC");
			jogador4.setTime("ATLÉTICO-MG");
			jogador4.setAtual(5.4F);
			jogador4.setJogadorInfo(JogadorInfo.REAL);
			em.persist(jogador4);
			
			em.getTransaction().commit();
			System.out.println("Adicionou todos!!");
			*/
			//getFullTextEntityManager().createIndexer().startAndWait();
			
			QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
			Query luceneQuery =  qb.bool()
				.must(qb.keyword().onField("jogadorInfo").matching(JogadorInfo.REAL).createQuery()).createQuery();	
			
			FullTextQuery fullTextQuery = getFullTextEntityManager().createFullTextQuery(luceneQuery, Jogador.class);
			
			@SuppressWarnings("unchecked")
			List<Jogador> jogadores = fullTextQuery.getResultList();
			
			for (Jogador jogador: jogadores){
				System.out.println(jogador);
			}
			
		} else {
			System.out.println("Problemas na conexão!!");
		}
		
	}

}
