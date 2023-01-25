package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, media;
		System.out.print("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = teclado.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = teclado.nextInt();
		media = (a+b+c)/3;
		System.out.println("Média: "+media);
		
	}

}
