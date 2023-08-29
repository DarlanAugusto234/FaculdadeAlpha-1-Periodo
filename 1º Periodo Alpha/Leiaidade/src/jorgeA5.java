

import java.util.Scanner;

public class jorgeA5 {

	public static void main(String[] args) {
		
		int bolsonaro = 0, lula = 0, candidato;
		Scanner jorge5 = new Scanner(System.in);
		
		System.out.println("Digite o Numero do Candidato a Presidencia:");
		candidato = jorge5.nextInt();
			
			while (candidato == 13) {
				System.out.println("-Votou em Lula!-");
				lula++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
				System.out.println();
			}
			while (candidato == 22) {
				System.out.println("-Votou em Bolsonaro!-");
				bolsonaro++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
				System.out.println();
			}
			if (candidato < 0) {
				System.out.println("Esse Candidato não Existe");
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
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