package prova2Avaliacao;

import java.util.Scanner;

public class prova2 {

	public static void main(String[] args) {

		int numeros = 0, numeros100 = 0, total = 0;
		Scanner prova2 = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escreva um Numero:");
			numeros = prova2.nextInt();
	
			if (numeros >= 100) {
				numeros100++;
			}
			else if (numeros <= 0) {
				break;
			}
		}
		System.out.println("Numeros Inseridos que são Maiores e Iguais 100 : " + numeros100);
		
		
	}

}
