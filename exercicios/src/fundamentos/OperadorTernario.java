package fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "Em Recuperacão.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		double nota = 9.7;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
