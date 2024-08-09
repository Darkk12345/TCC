package classe;

public class AreaCirc {
	//AreaCirc se completa com AreaCircTeste
	double raio;
	double pi;
	
	
	public AreaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}

}
