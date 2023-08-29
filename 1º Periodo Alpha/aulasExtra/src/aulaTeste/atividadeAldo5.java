package aulaTeste;

import java.util.Scanner;

public class atividadeAldo5 {

	public static void main(String[] args) {
		
		int mensalidade, quantidade;
		double total;
		final double VALOR_DISCIPLINA = 100;
		Scanner aldo5 = new Scanner(System.in);
		
		System.out.println("Quantidade de Disciplinas:");
		quantidade = aldo5.nextInt();
		
		total = quantidade * VALOR_DISCIPLINA;
		
		System.out.println("Valor Total da Mensalidades:\n" + total);
	}

}
