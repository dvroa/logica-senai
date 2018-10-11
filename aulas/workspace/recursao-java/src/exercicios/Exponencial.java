package exercicios;

public class Exponencial {
	public static void main(String[] args) {
		System.out.println("O resultado é . . .");
		System.out.println(Exponencial.calcular(2, 32));

	}
	public static long calcular (int n1, int n2) 
	{
		if (n2 == 0) 
		{
			return 1;
			
		}
		else 
		{
			return n1 * calcular(n1, --n2);
		}
	}
}
