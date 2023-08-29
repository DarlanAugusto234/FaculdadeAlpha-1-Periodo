package andreAula;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class andreA1 {

	public static void main(String[] args) throws IOException {
		
		Random teste = new Random();
		
		int aleatorio = teste.nextInt(20);
		List<String> nomes = new ArrayList<>();
		nomes.add("Vini");
		nomes.add("Felipe");
		
		FileWriter fw = new FileWriter(new File("log.txt"));
		fw.write("Nome escolhido: " + nomes.get(aleatorio));
		
		
		
		
		
	}

}
