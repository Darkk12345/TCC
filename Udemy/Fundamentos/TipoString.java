package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola Pessoal".charAt(2));
		
		String s = "Boa Tarde";	
	
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");//Método concatenação
		System.out.println(s.startsWith("Boa "));//Inicia com 
		System.out.println(s.endsWith("tarde"));//termina com
		System.out.println(s.length());
		
		//Comparação de igualdade
		System.out.println(s.equals("Boa tarde"));
		
		//(Ignore case) Vai ignorar o Caps lock
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		// (\n) para quebra de linhas 
		
		var nome = "Pedro";
		var sobrenome = "Silva";
		var idade = "30";
		var salario = 12345.987;
		
		String maisUmaFrase = "Nomes: " + nome +  "\nSobrenome: "
				+ sobrenome  + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		//Para treinar a notação ponto
		System.out.println("Frase Qualquer".substring(6));
		System.out.println("Frase Qualquer".contains("qual"));
				}
}
