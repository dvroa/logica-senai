package exemplos;

public class ExcecaoStringNaoExiste {
	public static void main(String[] args) {
		try {
			String a = null; 
			System.out.println(a.charAt(0));

			
		} catch (NullPointerException npe) {
			System.out.println("Pensa bem");
			
		}
		
	}
}
