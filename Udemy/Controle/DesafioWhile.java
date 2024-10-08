package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadedeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair):");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadedeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!");
			}
		}

		// calcular Média
		double media = total / quantidadedeNotas;
		System.out.println("Média = " + media);

		entrada.close();
	}
}
