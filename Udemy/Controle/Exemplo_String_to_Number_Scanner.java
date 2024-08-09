package Controle;

import java.util.Scanner;

public class Exemplo_String_to_Number_Scanner {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("DigÃ­te o nome do dia: ");

		String dia = entrada.next();

		// exemplo 1 scanner string retorna número
		/*
		 * if("domingo".equalsIgnoreCase(dia)) { System.out.println(1); }
		 */
		// exemplo 1 scanner e string retorna nÃºmero
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);

		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}

		entrada.close();

	}
}
