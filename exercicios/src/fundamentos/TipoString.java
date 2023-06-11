package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		// para retornar valor no indice 0
		System.out.println("Ola Pessoal".charAt(0));
		
		String s = "Boa Tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		
		var nome = "Luan";
		var apelido = "Rocha";
		var idade = 8;
		var mesada = 5000;
		
		System.out.println("Nome: " + nome + "\nApelido: " + apelido + "\nIdade: " + idade + "\nMesada:" + mesada + "\n\n");
		 
		System.out.printf("Voce %s %s és o meu filho preferido, com %d de idade te dei uma mesada de %s ESCUDOS", nome, apelido, idade, mesada);
		
		
	}
}
