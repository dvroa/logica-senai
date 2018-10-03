package exemplos;

public class DoWhile {
	public static void main(String[] args) {
		int num = 1;
		
		do 
		{
			System.out.println("Olha eu aqui pela " + num + "ª vez!");
			++num;
		} 
		while (num < 10);
	}

}
