package aulaTeste;

import java.util.Locale;
import java.util.Scanner;

public class TarefaA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double raio, pi, areaCirculo;
		Scanner leitura = new Scanner(System.in);
		
		leitura.useLocale(Locale.US);
		
		System.out.println("informe o valor do raio do circulo");
		raio = leitura.nextDouble();
		
		pi = 3.14159;
		areaCirculo = pi * (raio * raio);
		
	    System.out.println("AREA = %.4f " + areaCirculo);
	
	    leitura.close();
				
		
	}

}
