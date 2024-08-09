package Fundamentos;

public class Conversor {
	public static void main(String[] args) {
		// Fórmula (F° - 32) x 5/9 = °C

		final double y = 32;
		final double d = (5 / 9.0);
		double f = 132;
		final double c = (f - y) * d;

		System.out.println(c);

	}

}
