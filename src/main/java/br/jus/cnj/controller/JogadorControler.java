package br.jus.cnj.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.jus.cnj.model.Jogador;
import br.jus.cnj.services.JogadorService;

public class JogadorControler {

	private ApplicationContext context = new ClassPathXmlApplicationContext("context-application.xml");
	private JogadorService jogServ = context.getBean(JogadorService.class); 
	
	public void addJogador(Jogador jog){
		jogServ.addJogador(jog);
	}

	
	
}
