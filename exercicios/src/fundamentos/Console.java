package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia!\n");
		
		System.out.println("Boa tarde");
		
		System.out.printf("Totoloto:  %d %d %d %d %d \n", 1, 2, 3, 4, 5);
		
		System.out.printf("Salário: %.1f", 123.567);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu apelido: ");
		String apelido = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade", nome, apelido, idade);
		
		entrada.close(); // para parar de usar os recurso do metodo Scanner
		
		
	}
}
