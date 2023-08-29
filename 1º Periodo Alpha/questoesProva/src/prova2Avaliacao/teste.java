package prova2Avaliacao;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class teste {

	public static void main(String[] args) {
		
		int escolha;
		double numero, numero2;
		Scanner teste = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		numero = teste.nextInt();
		
		System.out.println("Digite o 2 Numero");
		numero2 = teste.nextInt();
		
		System.out.println("Escolha seu metodo:\n");
		System.out.println("1 = Soma");
		System.out.println("2 = Divisão");
		System.out.println("3 = Multiplicação");
		System.out.println("4 = Subtração");
		System.out.println("5 = Porcentagem\n");
		System.out.println("Qual você escolhe?");
		escolha = teste.nextInt();
		
		switch (escolha) {
			case 1:
				System.out.println("\nSoma dos Numeros Digitados = " + (numero += numero));
				break;
			case 2:
				System.out.println("\nDivisão dos Numeros Digitados = " + numero / numero2);
				break;
			case 3:
				System.out.println("\nMultiplicação dos Numeros Digitados = " + numero * numero2);
				break;
			case 4:
				System.out.println("\nSubtração dos Numeros Digitados= " + (numero - numero2));
				break;
			case 5:
				System.out.println("\nPorcentagem dos Numeros Digitados= " + (numero * numero2) / 100 + "%");
				break;
			default :
				System.out.println("Os Numeros Digitados foram 0!");
		}
		
		
		
		
		
		
	}

}
