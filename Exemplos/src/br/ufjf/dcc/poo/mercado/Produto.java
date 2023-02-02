package br.ufjf.dcc.poo.mercado;

import java.util.ArrayList;

public class Produto {
	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	private ArrayList<ItemPedido> itensPedidos;
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public int getPeso() {
		return peso;
	}

	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}

	public ArrayList<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}

	public void setItensPedidos(ArrayList<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public Produto consultarProduto() {return null;}
}
