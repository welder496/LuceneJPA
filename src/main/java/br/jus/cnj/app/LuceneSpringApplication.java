package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();
    
	    JogCtrl.deleteAllJogador();
	    
	    JogCtrl.addJogador("ANDRÉ GOMES", JogadorInfo.CARTAO_AMARELO, 9.8F, "CRICIÚMA", "ATLÉTICO-GO", 11);
		JogCtrl.addJogador("FERNANDO ADISON",JogadorInfo.TITULAR,2.1F,"VITORIA","BOTAFOGO",1);	    
		JogCtrl.addJogador("FERNANDO PRAS",JogadorInfo.CARTAO_VERMELHO,3.1F,"GRÊMIO","FLUMINENSE",4);	    
		JogCtrl.addJogador("ROBERTO CARLOS",JogadorInfo.EMPRESTADO,2.4F,"REAL MADRI","BOTAFOGO",2);	    
		JogCtrl.addJogador("GABRIEL DOMINGOS",JogadorInfo.JOGANDO,5.7F,"SANTOS","SANTA CRUZ",5);	    
		JogCtrl.addJogador("ANDRADE",JogadorInfo.JOGANDO,2.8F,"SANTOS","SANTA CRUZ",7);
		JogCtrl.addJogador("ANDRADE NORIEGA",JogadorInfo.JOGANDO,2.8F,"SANTOS","CORITIBA",7);		
		JogCtrl.addJogador("ANDRADE TELÓI",JogadorInfo.JOGANDO,2.8F,"BOA VISTA","SANTA LUZ",7);
		JogCtrl.addJogador("ROBINHO",JogadorInfo.JOGANDO,3.1F,"INTERNACIONAL","FLUMINENSE",4);	    
		JogCtrl.addJogador("LÉO MOURA",JogadorInfo.LESÃO,2.4F,"SPORT","BOTAFOGO",2);	    
		JogCtrl.addJogador("DIEGO CAVALIERE",JogadorInfo.LESÃO,2.4F,"FLUMINENSE","BOTAFOGO",2);
		JogCtrl.addJogador("DIEGO PASTALIERE",JogadorInfo.LESÃO,2.4F,"FLORMINENSE","BOTAFOGO",2);		
		JogCtrl.addJogador("MIEGO KASTALIERE",JogadorInfo.LESÃO,2.4F,"FLUMINENSE","BOTAFOGO",2);
		JogCtrl.addJogador("YEGO SIRILIERE",JogadorInfo.LESÃO,2.4F,"FLUMINENSE","BOTAFOGO",2);		
		JogCtrl.addJogador("GRAFITE",JogadorInfo.JOGANDO,5.7F,"FLAMENGO","SANTA CRUZ",5);	    
		JogCtrl.addJogador("CARLOS EDUARDO",JogadorInfo.RESERVA,2.8F,"BRASILIENSE","SANTA CRUZ",7);
		JogCtrl.addJogador("CARLOS GOMES",JogadorInfo.SUSPENSO,2.8F,"BRASILIENSE","SANTA CRUZ",7);
		JogCtrl.addJogador("LUCAS GOMES",JogadorInfo.JOGANDO,7.2F,"RIO VERDENSE","LUVERSENDE", 8);
		JogCtrl.addJogador("LUCHAS GOMIES",JogadorInfo.SUSPENSO,7.2F,"RIO VERDENSE","LUVERSENDE", 8);
		JogCtrl.addJogador("LUCCAS GOOOMES",JogadorInfo.CARTAO_AMARELO,7.2F,"RIO VERDENSE","LUVERSENDE", 8);
		JogCtrl.addJogador("LUCASS GLOMES",JogadorInfo.CARTAO_VERMELHO,7.2F,"LUVERDENSE","MINEIROS", 8);
		JogCtrl.addJogador("OSMAR LUCKS",JogadorInfo.JOGANDO,5.2F,"ATLÉTICO-GO","JATAIENSE", 10);
		JogCtrl.addJogador("CARILOS ORTEGA",JogadorInfo.SUSPENSO,5.2F,"INTERNACIONAL","GRÊMIO", 10);
		JogCtrl.addJogador("CHATITO ORTIEGA",JogadorInfo.SUSPENSO,5.2F,"CHAPECOENSE","GRÊMIO", 10);
		JogCtrl.addJogador("FÁBIO",JogadorInfo.JOGANDO,5.2F,"ATLÉTICO-GO","JATAIENSE", 10);
		JogCtrl.addJogador("PHÁBIO ORTEGA",JogadorInfo.JOGANDO,5.2F,"INTERNACIONAL","GRÊMIO", 10);
		JogCtrl.addJogador("FÁBHIO ORTIEGA",JogadorInfo.JOGANDO,5.2F,"CHAPECOENSE","GRÊMIO", 10);
		
		
		
		JogCtrl.createAndUpdateIndexes();
		
		/*
		System.out.println("Busca que contém termos...");
		System.out.println(JogCtrl.searchJogadoresContainsName("GRAFITE"));
		
		System.out.println("Busca exata com o termo...");
		System.out.println(JogCtrl.searchJogadoresByName("LUCAS GOMES"));
		
		System.out.println("Busca que contém termos parecidos com...");
		System.out.println(JogCtrl.searchJogadoresFuzzyName("LUCAS"));
		
		System.out.println("Busca que contém a sequência de caracteres...");
		System.out.println(JogCtrl.searchJogadoresByLike("ASTA"));
	
		System.out.println("Todas as buscas anteriores em uma só...");
		System.out.println(JogCtrl.searchAll("NORIEGA"));
		*/
		
		System.out.println("Com o nome parecido ou que contenha trecho e com determinada situação");
		System.out.println(JogCtrl.searchAllNomeAndInfo("FÁBIO ORTEGA", JogadorInfo.JOGANDO));
	}
	

}
