package Fundamentos;

public class Areacircunferencia {
	public static void main(String[] args) {
		//final double: para constantes
		double raio = 3.4;
		final double pi = 3.14159;
		
		double area = pi * raio *raio;
		System.out.println(area); 
		
		raio = 10;
		area = pi * raio *raio;
		System.out.println("Area = "+ area + "m2.");
		

	}
}
