package aulaTeste;

import java.util.Scanner;

public class atividadeAldo9 {

	public static void main(String[] args) {
		
		final double VALOR_TARIFA_A = 5.25;
		final double VALOR_TARIFA_B = 6.50;
		final double VALOR_TARIFA_C = 8.75;
		
		int diasUteis;
		double reembolso = 0;
		char tarifa;
		Scanner aldo9 = new Scanner(System.in);
		
		System.out.println("Dias Uteis:");
		diasUteis = aldo9.nextInt();
		
		System.out.println("Tipo da Tarifa Usada");
		tarifa = aldo9.next().charAt(0);
		
		if (tarifa == 'a' || tarifa == 'A') {
			reembolso = diasUteis * 2 * VALOR_TARIFA_A;
		}
		else if (tarifa == 'b' || tarifa == 'B') {
			reembolso = diasUteis * 2 * VALOR_TARIFA_B;
		}
		else if (tarifa == 'c' || tarifa == 'C') {
			reembolso = diasUteis * 2 * VALOR_TARIFA_C;
		}
		
		System.out.println("Valor a ser Reembolsado: " + reembolso);
	}

}
