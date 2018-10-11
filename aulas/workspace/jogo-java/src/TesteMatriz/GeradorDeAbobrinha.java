package TesteMatriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeAbobrinha {
	public static void main(String[] args) {

		System.out.println("Escreve uma palavra aí, meu consagrado");

		int maxPalavrasUsuario = 5;
		int maxPalavrasFrase = 8;

		Scanner entrada = new Scanner(System.in);
		String[] palavrasUsuario = new String[5];

		for (int i = 0; maxPalavrasUsuario > 0; i++) {
			palavrasUsuario[i] = entrada.nextLine();
			if (--maxPalavrasUsuario != 0) {
				System.out.println("Faltam " + maxPalavrasUsuario + ". Digite mais uma!");
			} else {
				System.out.println("Valeu, jovem! Agora deixa comigo.");
			}
		}

		System.out.println(Arrays.toString(palavrasUsuario));

		String[][] matrizPalavras = { { "bode", "", "pia", "", "bexiga" }, { "", "abraça", "", "mexe", "come" },
				{ "na", "de", "com", "dentro", "embaixo" }, { "", "eu", "nós", "alguém", "ninguém" },
				{ "você", "cabelo", "crocodilo", "shorts", "praia" } };

		for (int i = 0; i < matrizPalavras.length; i++) {
			for (int j = 0; j < matrizPalavras[i].length; j++) {
				if ("".equals(matrizPalavras[i][j])) {
					matrizPalavras[i][j] = palavrasUsuario[j];
				}
			}
		}

		System.out.println(Arrays.deepToString(matrizPalavras));

		String frase = "";
		Random random = new Random();
		for (int i = 0; i < maxPalavrasFrase; i++) {
			frase += matrizPalavras[random.nextInt(matrizPalavras.length)][random.nextInt(matrizPalavras.length)] + " ";

		}

		System.out.println("Minha frase é: \n" + frase);
	}
}
