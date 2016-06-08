package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();

	    JogCtrl.deleteAllJogador();
	    
		JogCtrl.addJogador("FERNANDO MIGUEL",JogadorInfo.REAL,2.1F,"VITORIA","BOTAFOGO",1);	    
		JogCtrl.addJogador("EDÍLSON",JogadorInfo.REAL,3.1F,"GRÊMIO","FLUMINENSE",4);	    
		JogCtrl.addJogador("NORBERTO",JogadorInfo.REAL,2.4F,"VITORIA","BOTAFOGO",2);	    
		JogCtrl.addJogador("DAVID BRAZ",JogadorInfo.REAL,5.7F,"SANTOS","SANTA CRUZ",5);	    
		JogCtrl.addJogador("GUSTAVO HENRIQUE",JogadorInfo.REAL,2.8F,"SANTOS","SANTA CRUZ",7);	    
		
		JogCtrl.deleteJogadorByName("DAVID BRAZ");
	
		System.out.println(JogCtrl.getJogadorByName("NORBERTO"));
		
	}
	

}
