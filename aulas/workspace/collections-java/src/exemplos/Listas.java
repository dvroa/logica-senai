package exemplos;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		// Array s� para compara��o
		String[] nomes = { "Douglas", "Fulano", "Ciclano", "Beltrano" };

		// Imprimir o array
		System.out.println(nomes);

		ArrayList<String> listaNomes = new ArrayList<>();

		// add - aadiciona um elemento na lista
		listaNomes.add("Douglas");
		listaNomes.add("Fulano");
		listaNomes.add("Ciclano");
		listaNomes.add("Beltrano");

		// Imprimir a lista
		System.out.println(listaNomes);

		// Size - mostra a quantidade de elementos na lista
		int tamanhoListaNomes = listaNomes.size();
		System.out.println("ArrayList: " + tamanhoListaNomes);

		int tamanhoArraysNomes = nomes.length;
		System.out.println("Array: " + tamanhoArraysNomes);

		// contains(obj) - verifica se um elemento existe na cole��o
		System.out.println("=contains==========");
		boolean existeNome = listaNomes.contains("Fulano");
		System.out.println(existeNome);

		existeNome = listaNomes.contains("Jos�");
		System.out.println(existeNome);
		
		// remove(obj) - remove um elemento da lista
		System.out.println("=remove============");
		boolean foiRemovido = listaNomes.remove("Fulano");
		System.out.println(foiRemovido);
		
		foiRemovido = listaNomes.remove("Vantuirson");
		System.out.println(foiRemovido);
		
		// imprimir a lista
		System.out.println(listaNomes);
		
		// get - obter elemento atrav�s de seu �ndice
		System.out.println("=get==============");
		String nomeEscolhido = listaNomes.get(0);
		System.out.println(nomeEscolhido);
		
		// indexOf - obter o indice do elemento atrav�s do seu nome
		System.out.println("=indexOf==============");
		int indiceDoBeltrano = listaNomes.indexOf("Beltrano");
		String beltrano = listaNomes.get(indiceDoBeltrano);
		System.out.println(beltrano);
		
		// addAll(collection) - adiciona uma outra lista dentro dessa 
		System.out.println("=addAll==============");
		ArrayList<String>  listaDeOutrosNomes = new ArrayList<>();
		listaDeOutrosNomes.add("Charmander");
		listaDeOutrosNomes.add("Squirtle");
		listaDeOutrosNomes.add("Bulbasaur");
		
		listaNomes.addAll(listaDeOutrosNomes);
		
		System.out.println(listaNomes);

	}
}
