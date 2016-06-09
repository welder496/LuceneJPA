package br.jus.cnj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.cnj.dao.JogadorDao;
import br.jus.cnj.model.Jogador;

@Service
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
	
	@Transactional
	public void deleteJogadorByName(String nome){
		jogadorDao.deleteByName(nome);
	}
	
	@Transactional
	public void deleteAll(){
		List<Jogador> jogadores = jogadorDao.findAll();
		for (Jogador jog: jogadores){
			jogadorDao.delete(jog);
		}
	}
	
	@Transactional(readOnly = true)
	public Jogador getJogadorByName(String nome){
		return jogadorDao.findByName(nome);
	}
	
	@Transactional
	public void deleteByName(String nome){
		jogadorDao.deleteByName(nome);
	}
	
	@Transactional(readOnly = true)
	public List<Jogador> listAll(){
		return jogadorDao.findAll();
	}
	
}
