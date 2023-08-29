package teste;

import java.util.Scanner;

public class testeJorge {

	public static void main(String[] args) {
		
		int bolsonaro = 1, lula = 1, candidato = 0, titulo = 0;
		Scanner jorge5 = new Scanner(System.in);
		
		System.out.println("Digite seu Titulo:");
		titulo = jorge5.nextInt();
		
		while (titulo <= 0) {
			System.err.println("Titulo não Cadastrado, digite novamente:");
			titulo = jorge5.nextInt();
		}
		
		System.out.println("Digite o Numero do Candidato a Presidencia:");
		candidato = jorge5.nextInt();
		System.out.println();
		
			while (candidato == 13) {
				System.out.println("-Votou em Lula- " + lula);
				lula++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
				System.out.println();
			}
			while (candidato == 22) {
				System.out.println("-Votou em Bolsonaro- " + bolsonaro);
				bolsonaro++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
				System.out.println();
			}
			
			System.out.println("Votos no Bolsonaro: " + bolsonaro);
			System.out.println("Votos no Lula: " + lula);
			
			if (lula++ > bolsonaro++) {
				System.out.println("Novo Presidente do Brasil é Lula");
			}
			else if (bolsonaro++ > lula++) {
				System.out.println("Novo Presidente do Brasil é Bolsonaro");
			}
			else {
				System.out.println("Terá Segundo Turno!");
			}
		
		
		
		

		
	}

}