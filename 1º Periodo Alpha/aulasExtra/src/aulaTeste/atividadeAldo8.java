package aulaTeste;

import java.util.Scanner;

public class atividadeAldo8 {

	public static void main(String[] args) {
		
		char pagamento;
		double calculo = 0, total = 0;
		int compra;
		Scanner aldo8 = new Scanner(System.in);
		
		System.out.println("Valor da Compra:");
		compra = aldo8.nextInt();
		
		System.out.println("Forma de Pagamento:");
		pagamento = aldo8.next().charAt(0);
		
		if (pagamento == 'V' || pagamento == 'v') {
			calculo = (0.03 * compra);
			total = compra - calculo;
		}
		else if (pagamento == 'P' || pagamento == 'p') {
			calculo = (0.05 * compra);
			total = compra - calculo;
		}
		System.out.println("Desconto de " + calculo + "R$");
		System.out.println("Valor a Pagar: " + total + "R$");
		
		
		

	}

}
