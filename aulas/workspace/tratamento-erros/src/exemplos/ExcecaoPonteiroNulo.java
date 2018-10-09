package exemplos;

public class ExcecaoPonteiroNulo {
	public static void main(String[] args) {
		try {
		String a = "Não sei o que tô fazendo"; 
		char c = a.charAt(50);
		System.out.println(c);
	}
		catch(StringIndexOutOfBoundsException siobe) 
		{
			System.out.println("não existe posição 50 em String, não seja idiota");
		}

	}
}
