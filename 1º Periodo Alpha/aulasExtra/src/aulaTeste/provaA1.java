package aulaTeste;

import java.util.Scanner;

public class provaA1 {

	public static void main(String[] args) {
		
		
		String nome;
		double salario, INSS, divisao, somaTotal;
		Scanner funcionario = new Scanner(System.in);
		
		System.out.println("Informe o Nome do Funcionario: ");
		nome = funcionario.nextLine();
		
		System.out.println("Informe seu Salario ");
		salario = funcionario.nextDouble();
		
		System.out.println("Informe o Percentual do INSS: ");
		INSS = funcionario.nextDouble();
		
		divisao = INSS / 100;
		somaTotal = salario + (divisao * salario);
		
		System.out.println("Salario Total: " + somaTotal);
		
		funcionario.close();
		
		
		
	}

}
