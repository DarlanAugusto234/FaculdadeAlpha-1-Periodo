package aulaTeste;

import java.util.Scanner;

public class atividadeAldo {

	public static void main(String[] args) {
		
		int turno, turno1, total;
		Scanner aldo = new Scanner(System.in);
		
		
		System.out.println("Produção do Turno 1" );
		turno = aldo.nextInt();
		
		System.out.println("Produção do Turno 2" );
		turno1 = aldo.nextInt();
		
		total = turno + turno1;
		
		System.out.println("Total da Produção:\n" + total);
	}

}
