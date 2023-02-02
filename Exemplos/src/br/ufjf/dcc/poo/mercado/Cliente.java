package br.ufjf.dcc.poo.mercado;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	private double limiteCredito;
	private int cartaoCredito;
	private String contato;
	private boolean status;
	private ArrayList<Pedido> pedidos;
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public int getCartaoCredito() {
		return cartaoCredito;
	}
	public String getContato() {
		return contato;
	}
	public boolean isStatus() {
		return status;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public double verificaCredito() {return 0;}
	public int validaCartao() {return 0;}
	
}
