package br.ufjf.dcc.poo.mercado;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNasc;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int calcIdade(){return 0;}
}
