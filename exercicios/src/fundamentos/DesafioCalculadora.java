package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// ler num1
		// ler num2
		// + - * / %
		
		System.out.println("\n<<<< CALCULADORA >>>>");
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("Insira o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Insira a operacão:");
		char op = entrada.next().charAt(0);
		
		double resultado = (op == '+' ) ? num1 + num2 :
			               (op == '-') ? num1 - num2 :
			               (op == '*') ? num1 * num2 :
			               (op == '/') ? num1 / num2 :
			               (op == '%') ? num1 % num2 : 0;
		
		System.out.println("Resultado: " + resultado);
	
		entrada.close();
	}
	
}
