package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
	
		double a = 1.1234567888; // Implícita
		System.out.println(a);
		
		float b = (float) 1.12345678888; //explcita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //explcita (CAST)
		System.out.println(f);
		
	}

}
