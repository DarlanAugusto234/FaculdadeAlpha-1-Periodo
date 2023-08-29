package prova2Avaliacao;

import java.util.Scanner;

public class prova3 {

	public static void main(String[] args) {

		int numeros, inicio, negativo = 0, positivo = 0;
		Scanner prova3 = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um Numero:");
			numeros = prova3.nextInt();
			
			if (numeros > 0) {
			positivo++;	
			}
			if (numeros < 0) {
			negativo++;	
			}
			if (numeros == 0) {
				break;
			}
		}
		
		System.out.println("Numeros Positivos Digitados: " + positivo);
		System.out.println("Numeros Negativos Digitados: " + negativo);
		
		
		
		
		
		
		
		
	}

}
