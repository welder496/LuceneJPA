package app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	private static JogadorControler jcControl = new JogadorControler();
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		jcControl.addJogador("WALTER",JogadorInfo.REAL,9.5F,2,"CORINTHIANS","FLAMENGO");
	}

}
