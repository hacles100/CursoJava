package fundamentos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celcius: ");
		double celcius = entrada.nextDouble();
		
		double fahrenheit = celcius * 1.8 + 32;
		
		System.out.println("Essa temperatura em Fahrenheit é: " + fahrenheit);
		
		entrada.close();
	}
}
