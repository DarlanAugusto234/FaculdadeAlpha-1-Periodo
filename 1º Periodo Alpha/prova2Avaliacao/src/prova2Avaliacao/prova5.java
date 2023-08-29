package prova2Avaliacao;

import java.util.Scanner;

public class prova5 {

	public static void main(String[] args) {

		int menor = Integer.MAX_VALUE;
		int maior = 0;
		int codigo = 0, preco = 0, media = 0, soma = 0, quantidade = 0;
		
		Scanner prova5 = new Scanner(System.in);
		
		System.out.println("Digite o codigo de acesso:");
		codigo = prova5.nextInt();
		
		for (int i = 0; i < 10; i++) {
			quantidade++;
			System.out.println("Insira o valor do produto:");
			preco = prova5.nextInt();
			soma = soma + preco;
			
			if (preco > maior) {
				maior = preco;
			}
			if (preco < menor) {
				menor = preco;
			}
			media = soma / quantidade;
		}
		
		System.out.println("Menor Preço Lido: " + menor); 
		System.out.println("Maior Preço Lido: " + maior);
		System.out.println("Media dos Produtos: " + media);
	}

}
