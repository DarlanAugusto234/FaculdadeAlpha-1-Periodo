package aulaTeste;

import java.util.Scanner;

public class TarefaA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, C, D, total;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("valor de A");
		A = valor.nextInt();
		
		System.out.println("valor de B");
		B = valor.nextInt();
		
		System.out.println("valor de C");
		C = valor.nextInt();
		
		System.out.println("valor de D");
		D = valor.nextInt();
		
		
		total =  (A * B - C * D);
		System.out.println("diferença total" + total);
		
		
		
	}

}
