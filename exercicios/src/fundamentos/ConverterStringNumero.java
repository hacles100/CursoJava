package fundamentos;

import javax.swing.JOptionPane;

public class ConverterStringNumero {

	public static void main(String[] args) {
		
		
	  String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
	  
	  String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		
	  // Irá concatenar os dois valores, pois sao do tipo string
	  System.out.println(valor1 + valor2);
	}
}
