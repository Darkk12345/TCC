package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentença; ou  {}
		// While(...) sentença; ou {}
		// for(...;...;...;)
		
		//do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.print("Quer Sair?");
			texto = entrada.nextLine();	
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}