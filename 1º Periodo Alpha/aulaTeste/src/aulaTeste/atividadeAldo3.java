package aulaTeste;

import java.util.Scanner;

public class atividadeAldo3 {

	public static void main(String[] args) {
		
		int dias, horas, total;
		Scanner aldo3 = new Scanner(System.in);
		
		System.out.println("Dias: ");
		dias = aldo3.nextInt();
		
		System.out.println("Horas: ");
		horas = aldo3.nextInt();
		
		total = (dias * 24) + horas;
		
		System.out.println("Duração da Viajem:\n" + total);
		
		
		
		

	}

}
