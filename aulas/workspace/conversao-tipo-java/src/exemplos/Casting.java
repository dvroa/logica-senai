package exemplos;

public class Casting {
	public static void main(String[] args) {
		// Casting
		double num1 = 1000;
		int num2 = 200;
		
		long resultadoDiv = (long) (num1/num2);
		
		System.out.println(resultadoDiv);
		
		float num3 = 8.5f;
		double num4 = 16.5;
		
		double resultadoParcial = num3 * num4;
		System.out.println(resultadoParcial);
		
		long resultadoFinal = (long) (num3 + num4);
		System.out.println(resultadoFinal);
	}

}
