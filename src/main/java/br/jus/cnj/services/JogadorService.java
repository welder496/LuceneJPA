package br.jus.cnj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.jus.cnj.dao.JogadorDao;
import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;

@Component
public class JogadorService {

	@Autowired
	private JogadorDao jogadorDao;
	
	@Transactional
	public void addJogador(String nome, JogadorInfo info, float atual, int rodada, String time, String timeadversario){
	   Jogador temp = new Jogador();
	   temp.setNome(nome);
	   temp.setAtual(atual);
	   temp.setRodada(rodada);
	   temp.setJogadorInfo(info);
	   temp.setTime(time);
	   temp.setTimeAdversario(timeadversario);
	   jogadorDao.persist(temp);
	}	
	
}
