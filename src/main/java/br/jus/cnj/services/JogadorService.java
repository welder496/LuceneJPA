package br.jus.cnj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.jus.cnj.dao.JogadorDao;
import br.jus.cnj.model.Jogador;

@Component
public class JogadorService {

	@Autowired
	private JogadorDao jogadorDao;
	
	@Transactional
	public void addJogador(Jogador jog){
	   jogadorDao.persist(jog);
	}	
	
	@Transactional
	public void delete(Jogador jog){
	   jogadorDao.delete(jog);
	}
	
	@Transactional(readOnly = true)
	public List<Jogador> listAll(){
		return jogadorDao.findAll();
	}
	
}
