package aulaTeste;

import java.util.Scanner;

public class TarefaA9 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub

		int peça1, peça2, totalP, totalQ, infovalor, quantidade1, quantidade2;
		double valor1, valor2, vezes1, vezes2, resultado;
		Scanner pagamento = new Scanner(System.in);
		
//		Aqui e só para imprimir
		System.out.println("Numero da Peça N1: ");
		peça1 = pagamento.nextInt();
		System.out.println("Numero da Peça N2: ");
		peça2 = pagamento.nextInt();
		
		System.out.println("Quantidade da Peça N1: ");
		quantidade1 = pagamento.nextInt();
		System.out.println("Quantidade da Peça N2: ");
		quantidade2 = pagamento.nextInt();			
		
		System.out.println("Valor da Peça N1: ");
		valor1 = pagamento.nextDouble();
		System.out.println("Valor da Peça N2: ");
		valor2 = pagamento.nextDouble();
		
		vezes1 = valor1 * quantidade1;
		vezes2 = valor2 * quantidade2;
		
//		DADOS DA PRIMEIRA PEÇA!
		System.out.println("―――――――――――――――――――――――――――――――");
		System.out.println("  ✔Primeira Peça✔ ");
		System.out.println("Numero da Peça: " + peça1);
		System.out.println("Valor da Peça: " + "$" + valor1);
		System.out.println("Quantidade de Peças: " + quantidade1);
		System.out.println("Total da Peça(s): " + "$" + vezes1);
		System.out.println("―――――――――――――――――――――――――――――――");
		
//		DADOS DA SEGUNDA PEÇA!
		System.out.println("  ✔Segunda Peça✔ ");
		System.out.println("Numero da Peça: " + peça2);
		System.out.println("Valor da Peça: " + "$" + valor2);
		System.out.println("Quantidde da Peças: " + quantidade2);
		System.out.println("Total da Peça(s): " + "$" + vezes2);
		
		resultado = vezes1 + vezes2;
		
//		RESULTADO FINAL!
		System.out.println();
		System.out.println("Total das 2 Peças: " + resultado);
		
		pagamento.close();

	}

}
