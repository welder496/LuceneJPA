package br.jus.cnj.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;
import br.jus.cnj.services.JogadorService;

public class JogadorControler {

	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private JogadorService jogServ = context.getBean(JogadorService.class); 
	
	
	public void addJogador(String nome, JogadorInfo info, float atual, String time, String timeAdversario, int rodada){
		Jogador temp = new Jogador();
		temp.setNome(nome);
		temp.setAtual(atual);
		temp.setJogadorInfo(info);
		temp.setTime(time);
		temp.setTimeAdversario(timeAdversario);
		temp.setRodada(rodada);
		jogServ.addJogador(temp);
	}
	
	
}
