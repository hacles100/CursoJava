package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 80;
		
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		double nota = 9.9;
		boolean bomComportamento =  true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
	}
}
