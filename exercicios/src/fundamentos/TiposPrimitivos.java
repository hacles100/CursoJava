package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informacoes do funcionario
		
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_567_987L;
		
		System.out.println("Anos de empresa: " + anosDeEmpresa);
		System.out.println("Numero de voos feitos: " + numeroDeVoos);
		System.out.println("Id funcionario: " + id);
		System.out.println("Pontos Acumulados: " + pontosAcumulados);
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		System.out.println("Salario: " + salario);
		System.out.println("Vendas Acumuladas: " + vendasAcumuladas);
		
		// Tipo Booleano
		boolean estaDeFerias = false; // true
		
		System.out.println("Estas de ferias? " + estaDeFerias);
		
		char status = 'A'; // Ative
		
		System.out.println("Estado: " + status);
	}
}
