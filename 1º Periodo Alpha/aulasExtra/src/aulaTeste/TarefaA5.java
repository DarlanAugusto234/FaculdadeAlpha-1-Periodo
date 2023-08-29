package aulaTeste;

import java.util.Scanner;

public class TarefaA5 {

	public static void main(String[] args) {
		
		int Valor1, Valor2, Valor3;
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("informe o primeiro valor");
        Valor1 = calculo.nextInt();
        
        System.out.println("informe o segundo valor");
        Valor2 = calculo.nextInt();
        
        Valor3 = Valor1 + Valor2;
        
        System.out.println("resultado da soma = ");
        System.out.println(Valor3);
		
		calculo.close();
		
	  
	  
		

	}

}
