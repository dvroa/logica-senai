package exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Parimpar {
	public static void main(String[] args) throws InterruptedException {
		
		//Preparando a aplicação para receber o input do teclado
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);
		
		//Declarando as variaveis necessárias
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario = "";
		
		//Mensagem de inicio
		System.out.println("Bora jogar um par ou impar ?");
		
		//1) Caso a resposta seja "sim", entramos no jogo.
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("oka") || aceite.equalsIgnoreCase("blz")) 
		{
			System.out.println("Combinado!");
			respostaUsuario.nextLine();
			
			System.out.println("Você quer PAR ou IMPAR ?");
			
			//4 Agora nos interessa guardar a resposta em uma variavel , porque precisamos
			//  se ele escolheu PAR ou IMPAR no decorrer do programa 
			escolhaUsuario = respostaUsuario.nextLine();
			
			if(escolhaUsuario.equalsIgnoreCase("par")) 
			{
				System.out.println("Vou de IMPAR, então");
			}
			else 
			{
				System.out.println("Vou de PAR, então");
			} 
			
			System.out.println("Escolha um número de 0 a 10");
			
			//6) se a resposta do usuarios contiver um "int", prossiga
			if(respostaUsuario.hasNextInt()) 
			{
				//8)Recuperar a resposta do usuario
				numeroUsuario =respostaUsuario.nextInt();
				
				numeroMaquina = new Random().nextInt(11);
				
				Thread.sleep(1000);
				
				System.out.println("Ok! Escolhi o " + numeroMaquina);
				
				int soma = numeroUsuario + numeroMaquina;
				System.out.println("Somando tudo deu " + soma);
				
				if(soma % 2 == 0 && escolhaUsuario.equalsIgnoreCase("par")) 
				{
					System.out.println("Você venceu!");
				}
				else if (soma % 2 != 0 && escolhaUsuario.equalsIgnoreCase("impar"))
				{
					System.out.println("Você venceu!");
				}
				else 
				{
					System.out.println("Venci!");
				}
			}
			
			else 
			{
				System.out.println("Não faça isso dave");
			}
		}
		//2) Caso a resposta seja não, nos despedimos 
		else 
		{
		  System.out.println("Firmeza! Falou");	
		}
		
	}

}
