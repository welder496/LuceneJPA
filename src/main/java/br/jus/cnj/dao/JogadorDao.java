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
	
	public void delete(Jogador jogador){
		em.remove(jogador);
	}
	
	public void deleteByName(String nome){
		em.createQuery("Delete from Jogador j where nome=:nome").setParameter("nome",nome).executeUpdate();
	}
	
	public Jogador findByName(String nome){
		return (Jogador) em.createQuery("Select j from Jogador j where nome=:nome").setParameter("nome", nome).getSingleResult();	
	}
	
	public List<Jogador> findAll() {
		return em.createQuery("SELECT j FROM Jogador j").getResultList();
	}
	
}
