package Fundamentos.Operadores;

public class Desafiologicos {
	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false; 
		boolean trabalho2 = false; 
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 ^ trabalho2;
		
		System.out.println("Comprou tv 50\"?" + comprouTV50);
		System.out.println("Comprou tv 32\"?" + comprouTV32);
		System.out.println("Comprou tv 32\"Sorvete?" + comprouSorvete);
		
		//Operador Unário!
		System.out.println("Mais Saudável?" + !comprouSorvete);
	}

}
