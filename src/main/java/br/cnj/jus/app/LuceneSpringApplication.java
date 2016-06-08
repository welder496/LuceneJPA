package br.cnj.jus.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.jus.cnj.model.Jogador;
import br.jus.cnj.services.JogadorService;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context-application.xml");	
		JogadorService jogServ = context.getBean(JogadorService.class);	
        
		jogServ.addJogador(new Jogador());
		
	    context.close();
	}

}
