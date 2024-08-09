package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "Preta":
			System.out.println("Sei o Bassai-dai...");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o heian godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "Laranja":
			System.out.println("Sei o Heian Sandan");
		case "Vermelha":
			System.out.println("Sei o Heian Nidan");
		case "Amarela":
			System.out.println("Sei o Heian Shodan");
//		default:
//			System.out.println("Não sei Nada");

		}
	}
}
