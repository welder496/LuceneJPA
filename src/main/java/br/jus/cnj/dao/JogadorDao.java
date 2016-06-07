package br.jus.cnj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.jus.cnj.model.Jogador;

@Component
public class JogadorDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void persist(Jogador jogador){
		em.persist(jogador);
	}
	
	public List<Jogador> findAll() {
		return em.createQuery("SELECT j FROM Jogador j").getResultList();
	}
	
}
