package exemplos;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		// 1) Diversas maneiras de declara um array (ou vetor) no java
		double precos[] = new double[5];
		
		String euMeAm[] = {"no", "seu", "coração"};
		
		double[] salarios = new double[6];
		
		int[] numeros = {1, 2, 3, 4};
		
		// 2) Imprimir um array não-vazio
		System.out.println(Arrays.toString(euMeAm));
		
		// 3) Imprimindo Um VALOR de um array não-vazio
		System.out.println(numeros[2]);
		
		// 4) imprimir um array vazio
		System.out.println(Arrays.toString(salarios));
		
		// 5) Colocar valor dentro de um array vazio 
		salarios[2] = 1200.40;
	    System.out.println(Arrays.toString(salarios));
	}
}
