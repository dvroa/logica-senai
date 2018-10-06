package exemplos;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> alunosLogica = new HashMap<>();
		
		alunosLogica.put(1, "Alex");
		alunosLogica.put(2, "Alexandre");
		alunosLogica.put(3, "André");
		
		System.out.println(alunosLogica);
		
		// Imprimir valores do mapa
		for (Integer key : alunosLogica.keySet()) 
		{
			System.out.println("Chave " + key);
			System.out.println(alunosLogica.get(key));
		}
		
		HashMap<String, String> empresas = new HashMap<>();
		
		empresas.put("Apple", "Empresas de eletrônicos");
		empresas.put("Walmart", "Empresas de varejo");
		empresas.put("Sony", "Empresas de eletrônicos");
		
		// Recuperar valor do mapa
		String descricaoApple = empresas.get("Apple");
		System.out.println(descricaoApple);
		
		// Mostrar tamanho do mapa
		System.out.println(empresas.size());
		
		// Remover item do mapa
		empresas.remove("Sony");
		System.out.println(empresas);
	}
	

}
