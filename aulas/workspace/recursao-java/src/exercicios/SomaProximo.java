package exercicios;

public class SomaProximo {
	public static void main(String[] args) {
		System.out.println("Somando. . .");
		System.out.println(SomaProximo.somar(2));

	}
	
	public static int somar(int max) 
	{
		if (max == 0) 
		{
			System.out.print(max + " = ");
			return max;
		}
		else 
		{
			System.out.print(max + " + ");
			return max + somar(--max);
		}
	}
}
