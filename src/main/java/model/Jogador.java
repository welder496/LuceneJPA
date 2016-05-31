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

	public float getAtual() {
		return atual;
	}

	public void setAtual(float atual) {
		this.atual = atual;
	}

	public float getUltima() {
		return ultima;
	}

	public void setUltima(float ultima) {
		this.ultima = ultima;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
}
