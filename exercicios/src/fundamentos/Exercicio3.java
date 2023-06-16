package fundamentos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Insira sua altura: ");
		double altura = entrada.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		System.out.println("O seu IMC é de: " + IMC);
		
		entrada.close();
	}
}
