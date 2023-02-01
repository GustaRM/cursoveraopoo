package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, i, j;
		System.out.println("Digite o começo do intervalo desejado: ");
		n1 = teclado.nextInt();
		System.out.println("Digite o final do intervalo desejado: ");
		n2 = teclado.nextInt();
		
		for(i=n1, j=1; i<=n2; i++, j++) {
			System.out.println(j + "° número: " + i );
		}


	}

}
