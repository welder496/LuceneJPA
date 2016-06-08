package br.jus.cnj.app;

import br.jus.cnj.controller.JogadorControler;
import br.jus.cnj.model.Jogador;
import br.jus.cnj.model.JogadorInfo;


public class LuceneSpringApplication {

	public static void main(String[] args) throws Exception {
	    JogadorControler JogCtrl = new JogadorControler();
		
		Jogador jog = new Jogador();
		jog.setNome("ANDRÉ");
		jog.setAtual(1);
		jog.setJogadorInfo(JogadorInfo.PREVISAO);
		jog.setTime("SANTOS");
		jog.setRodada(7);
		jog.setTimeAdversario("SÃO PAULO");
		
		JogCtrl.addJogador(jog);
		
	}

}
