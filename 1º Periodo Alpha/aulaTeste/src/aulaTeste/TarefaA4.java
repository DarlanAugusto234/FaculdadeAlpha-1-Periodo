package aulaTeste;

import java.util.Scanner;

public class TarefaA4 {

	public static void main(String[] args) {
		
		int valor1, valor2, total;
		Scanner calculo = new Scanner(System.in);		
		
		System.out.println("Digite o Primeiro Numero: ");
		valor1 = calculo.nextInt();
		System.out.println();
		
		System.out.println("Digite o Segundo Numero: ");
		valor2 = calculo.nextInt();
		System.out.println();
		
		total = valor1 + valor2;
		
		System.out.println("A Soma dos 2 numeros é: " );
		System.out.println(valor1 + " + " + valor2 + " : " + total + ".");
		
		calculo.close();
	}

}
