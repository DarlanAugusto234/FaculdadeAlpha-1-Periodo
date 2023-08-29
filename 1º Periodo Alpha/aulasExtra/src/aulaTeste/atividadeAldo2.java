package aulaTeste;

import java.util.Scanner;

public class atividadeAldo2 {

	public static void main(String[] args) {
		
		double gasosa, etanol, GNV, total;
		Scanner aldo2 = new Scanner(System.in);
		
		System.out.println("Quantidade usada em Gasolina:");
		gasosa = aldo2.nextDouble();
		
		System.out.println("Quantidade usada em Etanol:");
		etanol = aldo2.nextDouble();
		
		System.out.println("Quantidade usada em GNV:");
		GNV = aldo2.nextDouble();
		
		total = gasosa + etanol + GNV;
		
		System.out.println("Total usado:\n" + total);
	}

}
