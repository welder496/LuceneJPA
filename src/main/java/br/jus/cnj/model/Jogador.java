package br.jus.cnj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Indexed
public class Jogador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	@Field
	@Column(length=60)
	private String nome;

	@Field
	@Column(length=60)
	private String time;
	
	@Field
	@Column(length=60)
	private String timeAdversario;
	
	private float atual;
	
	private int rodada;
	
	@Column(length=30)
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
	
	public void setTime(String time){
		this.time=time;
	}
	
	public String getTime(){
		return time;
	}
	
	@Override
	public String toString(){
		return "Jogador [codigo ="+codigo+" nome="+nome+"]";
	}

	public String getTimeAdversario() {
		return timeAdversario;
	}

	public void setTimeAdversario(String timeAdversario) {
		this.timeAdversario = timeAdversario;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

}
