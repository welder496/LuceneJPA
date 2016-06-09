package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();

	    /*
	    JogCtrl.deleteAllJogador();
	    
	    JogCtrl.addJogador("LUIZ ANTONIO", JogadorInfo.REAL, 9.8F, "CRICIÚMA", "ATLÉTICO-GO", 11);
		JogCtrl.addJogador("FERNANDO MIGUEL",JogadorInfo.REAL,2.1F,"VITORIA","BOTAFOGO",1);	    
		JogCtrl.addJogador("EDÍLSON",JogadorInfo.REAL,3.1F,"GRÊMIO","FLUMINENSE",4);	    
		JogCtrl.addJogador("NORBERTO",JogadorInfo.REAL,2.4F,"VITORIA","BOTAFOGO",2);	    
		JogCtrl.addJogador("DAVID BRAZ",JogadorInfo.REAL,5.7F,"SANTOS","SANTA CRUZ",5);	    
		JogCtrl.addJogador("GUSTAVO HENRIQUE",JogadorInfo.REAL,2.8F,"SANTOS","SANTA CRUZ",7);
		JogCtrl.addJogador("ADAÍLSON",JogadorInfo.REAL,3.1F,"INTERNACIONAL","FLUMINENSE",4);	    
		JogCtrl.addJogador("DAGOBERTO",JogadorInfo.REAL,2.4F,"SPORT","BOTAFOGO",2);	    
		JogCtrl.addJogador("DAVID",JogadorInfo.REAL,5.7F,"FLAMENTO","SANTA CRUZ",5);	    
		JogCtrl.addJogador("LÚCIO",JogadorInfo.REAL,2.8F,"BRASILIENSE","SANTA CRUZ",7);
		
		
		JogCtrl.deleteJogadorByName("DAVID BRAZ");
	    */
		//System.out.println(JogCtrl.getJogadorByName("NORBERTO"));
		
		JogCtrl.createAndUpdateIndexes();
		
		//System.out.println(JogCtrl.searchJogadoresByName("NORBERTO"));
		
		System.out.println(JogCtrl.searchJogadoresByLike("D"));
	}
	

}
