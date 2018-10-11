package exercicios;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println("O fatorial é . . .");
		System.out.println(Fatorial.fator(5));
	}
	public static int fator (int valor) 
	{
		if(valor == 1) 
		{
			System.out.print(valor + " = ");
			return valor;
		}
		else 
		{
			System.out.print(valor + " * ");
			return valor * fator(--valor);
		}
	}
	
}
