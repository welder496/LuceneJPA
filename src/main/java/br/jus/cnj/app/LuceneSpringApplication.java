package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();

		JogCtrl.addJogador("FERNANDO MIGUEL",JogadorInfo.REAL,2.1F,"VITORIA","BOTAFOGO",7);	    
		JogCtrl.addJogador("EDÍLSON",JogadorInfo.REAL,2.1F,"GRÊMIO","FLUMINENSE",7);	    
		JogCtrl.addJogador("NORBERTO",JogadorInfo.REAL,2.1F,"VITORIA","BOTAFOGO",7);	    
		JogCtrl.addJogador("DAVID BRAZ",JogadorInfo.REAL,2.1F,"SANTOS","SANTA CRUZ",7);	    
		JogCtrl.addJogador("GUSTAVO HENRIQUE",JogadorInfo.REAL,2.1F,"SANTOS","SANTA CRUZ",7);	    
		
	}

}
