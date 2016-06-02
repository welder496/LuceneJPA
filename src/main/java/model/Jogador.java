package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jogador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nome;

	private float atual;
		
	@Enumerated(EnumType.STRING)
	private JogadorInfo jogadorInfo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAtual() {
		return atual;
	}

	public void setAtual(float atual) {
		this.atual = atual;
	}
	
	public void setJogadorInfo(JogadorInfo jogadorInfo){
		this.jogadorInfo=jogadorInfo;
	}
	
	public JogadorInfo getJogadorInfo(){
		return jogadorInfo;
	}
	
}
