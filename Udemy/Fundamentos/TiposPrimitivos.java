package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 5697;
		long pontosAcumulados = 3_234_845_223L;  //precisa do (L) no final para dizer que é um long literal
		
		//Tipos Numéricos Reais
		float salario = 11_445.44F;  //Literal float precisa por o (F) no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos Booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo ou inativo (I)		
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
