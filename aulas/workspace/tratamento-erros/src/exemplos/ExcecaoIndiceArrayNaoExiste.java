package exemplos;

public class ExcecaoIndiceArrayNaoExiste {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 9; 
			
		} catch (Exception e) {
			System.out.println("Errooouuuu");
			
		}

	}
}
