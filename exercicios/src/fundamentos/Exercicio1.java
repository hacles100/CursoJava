package fundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextInt();
		
		double celcius = (fahrenheit - 32) / 1.8;
		
		System.out.println("Essa temperatura em Celcius é de " + celcius);
		
		entrada.close();
		
	}
}
