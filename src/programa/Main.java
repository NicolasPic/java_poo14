package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import entidades.Votos;

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
				Votos voto = new Votos(nome,cont);
				if (lista.containsKey(voto.getNome())) {
					
					lista.put(voto.getNome(), cont + lista.get(voto.getNome()));
				}
				else {
					lista.put(voto.getNome(),voto.getVoto());
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
