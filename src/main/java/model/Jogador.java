package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jogador implements Serializable {

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nome;

	private float atual;
		
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
	
}
