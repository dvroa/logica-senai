package exemplos;

public class ExcecaoFormatoNumero {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(" :P ");
			System.out.println(num);
			
		} catch (Exception e) {
			System.out.println("n�o fa�a isso dave");
		}
		
	

	}
}
