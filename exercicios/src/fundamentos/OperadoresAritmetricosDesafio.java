package fundamentos;

public class OperadoresAritmetricosDesafio {

	public static void main(String[] args) {
		
		// Primeiro parte
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int d = b / c;
		
		//Segunda parte
		int e = (1 - 5) * (2 - 7);
		int f = e / 2;
		int g = (int) Math.pow(f, 2);
		
		//Terceira parte
		
		int h = d - g;
		int i = (int) Math.pow(h, 3);
		
		// Quarta parte
		int j = (int) Math.pow(10, 3);
		
		// Quinta e ultima parte
		int resultado = i / j;
		
		System.out.println("O resultado é: " + resultado);
		
		
		
	}
}
