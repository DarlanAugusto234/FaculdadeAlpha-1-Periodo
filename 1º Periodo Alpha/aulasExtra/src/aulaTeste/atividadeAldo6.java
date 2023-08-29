package aulaTeste;

import java.util.Scanner;

public class atividadeAldo6 {

	public static void main(String[] args) {
		
		int irmaos, net, energia, total;
		Scanner aldo6 = new Scanner(System.in);
		
		System.out.println("Valor da Internet:");
		net = aldo6.nextInt();
		
		System.out.println("Valor da Energia:");
		energia = aldo6.nextInt();
		
		System.out.println("Quantos Irmãos: (Maximo de 10 irmãos)");
		irmaos = aldo6.nextInt();
		
		total = (net + energia) / irmaos;
		
		if (irmaos >= 1) {
			System.out.println("Cada Irmão vai pagar:\n" + total);
		}
		else if (irmaos == 0) {
			System.out.println("Para rateio, a quantidade de irmão não pode ser zero");
		}
		
		
		
		
		
		
	}

}
