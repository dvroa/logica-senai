package selecao;

public class Switch {
	public static void main(String[] args) {
		String passeio = "deserto";

		switch (passeio) {
		case "montanha":
			System.out.println("Bora escalar!");
			break;
		case "deserto":
			System.out.println("Leva uma �gua!");
			break;
		case "floresta":
			System.out.println("Vai l�, Tarzan");
			break;
		case "mar":
			System.out.println("Comprar uma b�ia!");
			break;
			default:
				System.out.println("Ah, bora assistir Netflix");
				break;
			
		}
	}
}
