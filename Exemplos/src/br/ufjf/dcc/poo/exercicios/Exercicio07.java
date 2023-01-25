package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		int numeroSorteado = (int)(0 + Math.random() * 100);
		JOptionPane.showMessageDialog(null, numeroSorteado);
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 100: ", "Número", JOptionPane.INFORMATION_MESSAGE));
		if(num != numeroSorteado) {
			if(num < numeroSorteado) {
				JOptionPane.showMessageDialog(null, "Você errou! O número é maior.");
			}else {
				JOptionPane.showMessageDialog(null, "Você errou! O número é menor.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Você acertou!");
		}
	}

}
