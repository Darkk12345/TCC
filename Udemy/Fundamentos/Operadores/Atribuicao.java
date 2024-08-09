package Fundamentos.Operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		
		//c++; c = c + 1;
		
		System.out.println(c);
		c %= b; //c = c % a; 0 ou 1 (Impar ou Par
		System.out.println(c);
	}

}
