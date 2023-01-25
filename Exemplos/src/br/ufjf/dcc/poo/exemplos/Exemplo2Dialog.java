package br.ufjf.dcc.poo.exemplos;
import javax.swing.JOptionPane;

public class Exemplo2Dialog {
	
	public static void main(String[] args) {
		float n1;
		float n2;
		float soma;
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número: ", "Valor",JOptionPane.INFORMATION_MESSAGE)); 
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número: ", "Valor", JOptionPane.INFORMATION_MESSAGE)); 
		soma = n1+n2;
		JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
