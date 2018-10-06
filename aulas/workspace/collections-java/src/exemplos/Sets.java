package exemplos;

import java.util.HashSet;

public class Sets {
	public static void main(String[] args) {
		HashSet<String> conjuntoNomes = new HashSet<>();
		
		conjuntoNomes.add("Corolla");
		conjuntoNomes.add("Vectra");
		conjuntoNomes.add("Ford T");
		conjuntoNomes.add("Palio");
		conjuntoNomes.add("Camaro");
		
		System.out.println(conjuntoNomes);
		
		boolean adicionou = conjuntoNomes.add("Camaro");
		System.out.println(adicionou);
		

	}
}
