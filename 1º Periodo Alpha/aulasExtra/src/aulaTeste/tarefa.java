package aulaTeste;

public class tarefa {

	public static void main(String[] args) {
		
		int a, b;
		boolean x, y;
		
		a = 5;
		b = 7;
		
		System.out.println("Resposta da Questão:");
		System.out.println();
		
		x = (a == b);
		System.out.println(x + ".");
		
		y = (a != b);
		System.out.println(y + ".");
		
		y = x || (a > b);
		System.out.println(y + ".");
		
		x = y && (a > b);
		System.out.println(x + ".");
		
		y = !y;
		System.out.println(y + ".");
		
		
	}

}
