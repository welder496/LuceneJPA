package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jogador {

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nome;

	private float atual;
	
	private float ultima;
	
	private float media;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
