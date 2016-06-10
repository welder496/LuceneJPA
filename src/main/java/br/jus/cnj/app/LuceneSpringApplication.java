package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();
    
	    /*
	    JogCtrl.addJogador("ANDRÉ GOMES", JogadorInfo.REAL, 9.8F, "CRICIÚMA", "ATLÉTICO-GO", 11);
		JogCtrl.addJogador("FERNANDO ADISON",JogadorInfo.REAL,2.1F,"VITORIA","BOTAFOGO",1);	    
		JogCtrl.addJogador("FERNANDO PRAS",JogadorInfo.REAL,3.1F,"GRÊMIO","FLUMINENSE",4);	    
		JogCtrl.addJogador("ROBERTO CARLOS",JogadorInfo.REAL,2.4F,"REAL MADRI","BOTAFOGO",2);	    
		JogCtrl.addJogador("GABRIEL DOMINGOS",JogadorInfo.REAL,5.7F,"SANTOS","SANTA CRUZ",5);	    
		JogCtrl.addJogador("ANDRADE",JogadorInfo.REAL,2.8F,"SANTOS","SANTA CRUZ",7);
		JogCtrl.addJogador("ROBINHO",JogadorInfo.REAL,3.1F,"INTERNACIONAL","FLUMINENSE",4);	    
		JogCtrl.addJogador("LÉO MOURA",JogadorInfo.REAL,2.4F,"SPORT","BOTAFOGO",2);	    
		JogCtrl.addJogador("GRAFITE",JogadorInfo.REAL,5.7F,"FLAMENTO","SANTA CRUZ",5);	    
		JogCtrl.addJogador("CARLOS EDUARDO",JogadorInfo.REAL,2.8F,"BRASILIENSE","SANTA CRUZ",7);
			
		*/
		//JogCtrl.createAndUpdateIndexes();
		
		//System.out.println(JogCtrl.searchJogadoresByName("NORBERTO"));
		
		System.out.println(JogCtrl.searchJogadoresByLike("AD"));
	}
	

}
