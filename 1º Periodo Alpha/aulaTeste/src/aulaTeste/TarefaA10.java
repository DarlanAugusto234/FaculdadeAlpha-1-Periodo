package aulaTeste;

import java.util.Scanner;

public class TarefaA10 {

	public static void main(String[] args) {
		
		double A, B, C, Triangulo, Circulo, Retangulo, Trapezio, Quadrado, pi;
		Scanner tarefa = new Scanner(System.in);
		
		System.out.println("Informe o Lado A: ");
		A = tarefa.nextDouble();
		
		System.out.println("Informe o Lado B: ");
		B = tarefa.nextDouble();
		
		System.out.println("Informe o Lado C: ");
		C = tarefa.nextDouble();
		
		pi = 3.14159;
		
		Triangulo = A * C / 2;
		
		Circulo = C * pi * C;
		
		Trapezio = A + B / 2 * C;
		
		Quadrado = B * B;
		
		Retangulo = A * B;
		
		System.out.printf("Área do Triangulo é %.4f " , Triangulo);
		System.out.println();
		System.out.printf("Área do Circulo é %.4f " , Circulo);
		System.out.println();
		System.out.printf("Área do Trapezio é %.4f " , Trapezio);
		System.out.println();
		System.out.printf("Área do Quadrado é %.4f " , Quadrado);
		System.out.println();
		System.out.printf("Área do Retangulo é %.4f " , Retangulo);
		
		tarefa.close();
		
		
		
		
		
	}

}
