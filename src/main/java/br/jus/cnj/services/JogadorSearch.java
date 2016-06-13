package br.jus.cnj.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.apache.lucene.search.Query;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.BooleanJunction;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.jus.cnj.model.Jogador;

@Repository
@Transactional
public class JogadorSearch {

	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	private EntityManager em;
	private FullTextEntityManager ftem;
	
	private FullTextEntityManager getFullTextEntityManager(){
		if (ftem == null){
			ftem = Search.getFullTextEntityManager(em);
		}
		return ftem;
	}

	public void createIndex() throws InterruptedException{
		getFullTextEntityManager().createIndexer(Jogador.class).startAndWait();
		System.out.println("Indexação terminada!!");
	}
	
	@SuppressWarnings("rawtypes")
	public List containsSearch(String text){
		QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		BooleanJunction<BooleanJunction> bj = qb.bool();		
		
		Query query = bj.must(qb.keyword().onField("nome").matching(text.toLowerCase().trim()).createQuery()).createQuery();
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;		
	}
	
	@SuppressWarnings("rawtypes")
	public List exactSearch(String text){
		QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		BooleanJunction<BooleanJunction> bj = qb.bool();		
		
		String[] strings = text.split(" ");
		for (String str: strings){
			Query internalQuery = qb.keyword().onField("nome").matching(str.toLowerCase().trim()).createQuery();
			bj.must(internalQuery);
		}
			
		Query query = bj.createQuery();		
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;
	}
		
	@SuppressWarnings("rawtypes")
	public List likeSearch(String text){
		QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		BooleanJunction<BooleanJunction> bj = qb.bool();
		
		String[] strings = text.split(" ");
		for (String str: strings){
			Query internalQuery = qb.keyword().wildcard().onField("nome").matching("*"+str.toLowerCase().trim()+"*").createQuery();
			bj.must(internalQuery);
		}
			
		Query query = bj.createQuery();		
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;		
	}
	
	@SuppressWarnings("rawtypes")
	public List fuzzySearch(String text){
		QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		BooleanJunction<BooleanJunction> bj = qb.bool();
		
		String[] strings = text.split(" ");
		for (String str: strings){
			Query internalQuery = qb.keyword().fuzzy().onField("nome").matching("*"+str.toLowerCase().trim()+"*").createQuery();
			bj.must(internalQuery);
		}
			
		Query query = bj.createQuery();	
		
		//Query query = bj.must(qb.keyword().fuzzy().onField("nome").matching(text.toLowerCase().trim()).createQuery()).createQuery();
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;				
	}
	
}

