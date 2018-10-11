package exercicios;

public class Fibonacci {
	
	public static void main(String[] args) {
		int qntdSeq = 3;
		// 1) Estabelecemos uma quantidade de números de 0 a 10
		for (int i = 0; i <= qntdSeq; i++);
		{
			System.out.println(fibonacci(3));
		}

	}
	
	public static int fibonacci(int qntdSeq) 
	{
		if (qntdSeq <= 1) 
		{
			return qntdSeq;
		}
		else 
		{
			return fibonacci(qntdSeq - 1) + fibonacci(qntdSeq - 2);
		}
	}
}
