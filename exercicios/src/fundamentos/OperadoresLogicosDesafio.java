package fundamentos;

public class OperadoresLogicosDesafio {

	public static void main(String[] args) {
		
		// trabalho na terca (V ou F)
		// trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50 ? " + comprouTV50);
		System.out.println("Comprou TV 32 ? " + comprouTV32);
		System.out.println("Comprou tv 32 e Sorvete? " + comprouSorvete);
		
		
		System.out.println("Mais saudável? " + maisSaudavel);
		
		
	}
}
