package exercicios;

public class CalculosPraVoce {
	public static void main(String[] args) {
		
        // Invocação
		System.out.println(CalculosPraVoce.soma(2.0, 4.0));
		
		// Uma forma de invocar o método e imprimir o resultado
		System.out.println(CalculosPraVoce.sub(250, 75));
		
		// Igual ao de cima, mas guarda o resultado numa variável, pra depois imprimir
		double resultado = CalculosPraVoce.sub(250, 75);
		System.out.println(resultado);
		
		// Invocando sem return
		CalculosPraVoce.multi(300, 97);

	}

	public static double soma(double num1, double num2) {
		return num1 + num2;
	}

	public static double sub(double num1, double num2) {
	   return num1 - num2;
   }
	
	public static double div(double num1, double num2) {
		return num1 / num2;
	}
	public static void multi(double num1, double num2) {
		System.out.println(num1 * num2);
	}
}