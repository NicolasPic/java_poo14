package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\temp\\in.csv";

		Map<String, Integer> lista = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();

			while(linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				int cont = Integer.parseInt(campos[1]);
				
				if (lista.containsKey(nome)) {
					
					lista.put(nome, cont + lista.get(nome));
				}
				else {
					lista.put(nome, cont);
				}
				
				linha = br.readLine();
			}
			
			
			for (String e : lista.keySet()) {
				System.out.println(e + " : " + lista.get(e));
			}

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
