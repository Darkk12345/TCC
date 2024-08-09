package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Primeira Forma de Conversão
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Segunda Forma de Conversão
		int num2 = 100000; 
		System.out.println(Integer.toString(num2).length());
		
		//Terceira Forma
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}

}
