package aulaTeste;

import java.util.Scanner;

public class atividadeAldo7 {

	public static void main(String[] args) {
		
		String nome;
		double salario, reajuste, calculo, total; 
		double adicional;
		Scanner desafio = new Scanner(System.in);
		
		System.out.println("Informe o Salário: ");
		salario = desafio.nextDouble();
		
		if (salario <= 2640) {
			reajuste = 0.125 * salario;
			calculo = 1.125 * salario;
		}
		else  {
			reajuste = 0.085 * salario;
			calculo = 1.085 * salario;
		}
		System.out.println();
		System.out.println("Aumento: R$\n" + reajuste);
		System.out.println("Salario: R$\n" + calculo);
	}

}
