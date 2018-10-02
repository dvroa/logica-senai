package selecao;

public class Switch {
	public static void main(String[] args) {
		String passeio = "deserto";

		switch (passeio) {
		case "montanha":
			System.out.println("Bora escalar!");
			break;
		case "deserto":
			System.out.println("Leva uma água!");
			break;
		case "floresta":
			System.out.println("Vai lá, Tarzan");
			break;
		case "mar":
			System.out.println("Comprar uma bóia!");
			break;
			default:
				System.out.println("Ah, bora assistir Netflix");
				break;
			
		}
	}
}
