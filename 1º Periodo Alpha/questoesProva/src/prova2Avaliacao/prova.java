package prova2Avaliacao;

import java.util.Scanner;

public class prova {

	public static void main(String[] args) {

		int numeros = 0, soma = 0, quantidade = 0, total;
		Scanner prova = new Scanner(System.in);
		
		while (quantidade < 5) {
			quantidade++;
			System.out.println("Digite um Numero:");
			numeros = prova.nextInt();
			soma = numeros + soma;
		}
		System.out.println("Soma dos Numeros Digitados: " + soma);
	}

}
