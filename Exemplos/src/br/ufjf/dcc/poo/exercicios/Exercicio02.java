package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float lado1T, lado2T, lado1C, lado2C;
		float areaT, areaC, porcentagem;
		
		System.out.print("Lado 1 do terreno: ");
		lado1T = teclado.nextFloat();
		System.out.print("Lado 2 do terreno: ");
		lado2T = teclado.nextFloat();
		
		System.out.print("Lado 1 da casa: ");
		lado1C = teclado.nextFloat();
		System.out.print("Lado 2 da casa: ");
		lado2C = teclado.nextFloat();
		
		areaT = lado1T*lado2T;
		areaC = lado1C*lado2C;
		porcentagem = 100*(areaT - areaC)/areaT;
		
		System.out.println("Porcentagem da área livre: " + porcentagem + "%.");

	}

}
