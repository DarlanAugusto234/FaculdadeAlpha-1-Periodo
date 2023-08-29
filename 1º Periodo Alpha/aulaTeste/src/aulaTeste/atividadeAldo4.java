package aulaTeste;

import java.util.Scanner;

public class atividadeAldo4 {

	public static void main(String[] args) {
		
		double area1, area2, total;
		Scanner aldo4 = new Scanner(System.in);
		
		System.out.println("Escreva a Área 1: ");
		area1 = aldo4.nextDouble();
		
		System.out.println("Escreva a Área 2: ");
		area2 = aldo4.nextDouble();
		
		total = area1 * area2;
		
		System.out.println("Área do Retangulo:\n" + total);
		
	}

}
