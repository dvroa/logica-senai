package exemplos;

public class ExcecaoPonteiroNulo {
	public static void main(String[] args) {
		try {
		String a = "N�o sei o que t� fazendo"; 
		char c = a.charAt(50);
		System.out.println(c);
	}
		catch(StringIndexOutOfBoundsException siobe) 
		{
			System.out.println("n�o existe posi��o 50 em String, n�o seja idiota");
		}

	}
}
