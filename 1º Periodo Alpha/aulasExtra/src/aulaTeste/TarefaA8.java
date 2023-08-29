package aulaTeste;

import java.util.Scanner;

public class TarefaA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matricula;
		double salario, hora, total;
		Scanner funcionario = new Scanner(System.in);	
		
		System.out.println("numero");
		matricula = funcionario.nextInt();
		
		System.out.println("salario");
		salario = funcionario.nextDouble();
		
		System.out.println("hora");
		hora = funcionario.nextDouble();
		
		total = hora * salario;
		
		System.out.println("matricula: " + matricula);
		System.out.println("salario total: " + total);
		
		funcionario.close();
		
		
		
		
	}

}
