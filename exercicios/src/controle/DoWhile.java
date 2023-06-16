package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "Por Favor";
		
		do {
			
			System.out.println("Você precisa falar" + "\nas palavras mágicas...");
			System.out.println("Pretendes sair?");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("Por Favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
	}
}
