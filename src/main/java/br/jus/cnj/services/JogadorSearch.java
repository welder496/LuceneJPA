package br.jus.cnj.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.jus.cnj.model.Jogador;

@Repository
@Transactional
public class JogadorSearch {

	@PersistenceContext
	private EntityManager em;
	private FullTextEntityManager ftem;
	
	private FullTextEntityManager getFullTextEntityManager(){
		if (ftem == null){
			ftem = Search.getFullTextEntityManager(em);
		}
		return ftem;
	}
	
	public void createIndex() throws InterruptedException{
		getFullTextEntityManager().createIndexer().startAndWait();
	}
	
	@SuppressWarnings("rawtypes")
	public List exactSearch(String text){
		QueryBuilder dq = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		
		Query query = dq.keyword().onField("nome").matching(text).createQuery();
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;
	}
	
	@SuppressWarnings("rawtypes")
	public List likeSearch(String text){
		QueryBuilder dq = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Jogador.class).get();
		
		Query query = dq.keyword().wildcard().onField("nome").matching(text+"*").createQuery();
		
		FullTextQuery jpaQuery = getFullTextEntityManager().createFullTextQuery(query, Jogador.class);
		
		List results = jpaQuery.getResultList();
		
		return results;		
	}
	
}

