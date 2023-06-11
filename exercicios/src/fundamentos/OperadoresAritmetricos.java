package fundamentos;


public class OperadoresAritmetricos {

	public static void main(String[] args) {
		
		System.out.println(3 + 8);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 6;
		int b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // cast para mostrar o valor da divisao com as casas decimais
		System.out.println(a / (float) b);
		
		System.out.println(a % b);
		
	}
}
