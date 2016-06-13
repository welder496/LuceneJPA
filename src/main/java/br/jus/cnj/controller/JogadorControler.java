package br.jus.cnj.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;
import br.jus.cnj.services.JogadorSearch;
import br.jus.cnj.services.JogadorService;

public class JogadorControler {
	
	AnnotationConfigApplicationContext beanFactory = new AnnotationConfigApplicationContext(Config.class);
	JogadorService jogServ = beanFactory.getBean(JogadorService.class);
	JogadorSearch jogSearch = beanFactory.getBean(JogadorSearch.class);
	
	public void deleteAllJogador(){
		jogServ.deleteAll();
	}
	
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
		
	public void deleteJogadorByName(String nome){
		jogServ.deleteByName(nome);
	}
	
	public Jogador getJogadorByName(String nome){
		return jogServ.getJogadorByName(nome);
	}
	
	public void createAndUpdateIndexes() throws InterruptedException {
		jogSearch.createIndex();
	}
	
	@SuppressWarnings("rawtypes")
	public List searchJogadoresContainsName(String text){
		return jogSearch.containsSearch(text);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchJogadoresByName(String text){
		return jogSearch.exactSearch(text);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchJogadoresByLike(String text){
		return jogSearch.likeSearch(text);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchJogadoresFuzzyName(String text){
		return jogSearch.fuzzySearch(text);
	}
	
}

@Configuration
@ImportResource("applicationContext.xml")
class Config {
	
	@Bean
	public JogadorService jogadorService(){
		return new JogadorService();
	}
	
	@Bean
	public JogadorSearch jogadorSearch(){
		return new JogadorSearch();
	}
}
