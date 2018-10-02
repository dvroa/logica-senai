package selecao;

public class ElseIf {
	public static void main(String[] args) {
		float preco =  50.0f;
		
		if (preco <= 1.99) 
		{
			System.out.println("Compra Logo");
		}
		else if (preco > 1.99 && preco <= 200.0) 
			System.out.println("Ah, vou pensar . . . ");
	
	    else 
	    {
			System.out.println("Falooooou!");
		}
			
	}
}

