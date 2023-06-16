package controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("%d é um numero par! ", numero);
		}else {
			System.out.printf("%d é um numero ímpar! ", numero);
		}
		
		entrada.close();
	}
}
