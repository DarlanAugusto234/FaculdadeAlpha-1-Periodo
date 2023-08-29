package prova2Avaliacao;

import java.util.Scanner;

public class prova4 {

	public static void main(String[] args) {

		int numero = 0, inicio, i = 0, quantidade = 0;
		
		Scanner prova4 = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		numero = prova4.nextInt();
		
		System.out.println("Multiplicação do Numero Digitado:");
		
		while (quantidade < 10) {
			quantidade++;
			System.out.println("Mult = " + numero * quantidade);
		
		}
		
		
		
		
		
		
	}

}
