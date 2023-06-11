package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 =  3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2); // Operador ou exclusivo
		System.out.println(!condicao1);
		System.out.println(!condicao1 && condicao2);
		
		// Tabela Verdade AND
		
		System.out.println("\nTABELA VERDADE &&");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		// Tabela Verdade OR
		System.out.println("\nTABELA VERDADE ||");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		// Tabela Verdade OU EXCLUSIVO
		System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// Tabela Verdade NOT
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}
}
