package aulaTeste;

import java.util.Scanner;

public class TarefaA3 {

	public static void main(String[] args) {
		
		String aluno, disciplina;
		double nota1, nota2, nota3, total;
		Scanner escola = new Scanner(System.in);
		
		System.out.println("Nome do Aluno: ");
		aluno = escola.nextLine();
		
		System.out.println("Nome da Disciplina: ");
		disciplina = escola.nextLine();
		
		System.out.println("Notas: ");
		nota1 = escola.nextDouble();
		nota2 = escola.nextDouble();
		nota3 = escola.nextDouble();
		
		total = nota1 + nota2 + nota3;
		
		System.out.println();
		
		System.out.println("Aluno: " + aluno + ".");
		System.out.println("Disciplina: " + disciplina + ".");
		System.out.println("Notas: " + total / 2 + ".");

		escola.close();
	}

}
