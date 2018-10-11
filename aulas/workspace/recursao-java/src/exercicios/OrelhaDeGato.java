package exercicios;

public class OrelhaDeGato {
	public static void main(String[] args) {
		System.out.println("Quantidade de orelhas de gatos");
		System.out.println(OrelhaDeGato.orelhas(5));
		

	}
	public static int orelhas (int gatos) 
	{
		if(gatos == 0) 
		{
			return 0;
		}
			return 2 + orelhas(gatos - 1);
	}
}
