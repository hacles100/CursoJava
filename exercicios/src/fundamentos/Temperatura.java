package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// C = (F - 32) x 5/9
		
		final double Ajuste = 32;
		final double fator = 5.0/9.0;
		
		double f = 86;
		
		double c = (f - Ajuste) * fator;
		
		System.out.println("O resultado é " + c);
		 
	}
}
