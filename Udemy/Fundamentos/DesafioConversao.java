package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite Salario 1: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite Salario 2: ");
		String valor2 = entrada.next().replace(",", ".");

		System.out.print("Digite Salario 3: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double Salario1 = Double.parseDouble(valor1);
		double Salario2 = Double.parseDouble(valor2);
		double Salario3 = Double.parseDouble(valor3);
 		
		double media = (Salario1 + Salario2 + Salario3) / 3;
		System.out.println("A Media dos salariso e: "+ media);
		
		entrada.close();
		
		
		
		//String Salario1 = JOptionPane.showInputDialog(
			//	"Digite o  primeiro numero");
		
	}

}
