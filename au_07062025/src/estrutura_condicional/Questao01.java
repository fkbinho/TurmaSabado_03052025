package estrutura_condicional;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		/* Solicite ao usuário duas notas,
		 * o nome do Aluno e faça o calculo da
		 * média desse aluno.
		 * 
		 * Exiba a média e a sua situação:
		 * Aprovado: media >= 7 e media < 10
		 * Recuperação: media >= 4 e media < 7
		 * Reprovado: media >= 0 e media < 4
		 * */
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a 1ª nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a 2ª nota:");
		double nota2 = scan.nextDouble();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Digite o nome do Aluno:");
		String nome = scan.nextLine();		
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <= 10) {
			if (media == 10) {
				System.out.println("Aprovado com louvor!");
			} else {
				System.out.println("O aluno " + nome 
						+ " está APROVADO.");
				System.out.println("Média: " + media);
			}
		} else if (media >= 4) {
			System.out.println("O aluno " + nome 
					+ " está em RECUPERAÇÃO.");
			System.out.println("Média: " + media);
		} else {
			System.out.println("O aluno " + nome 
					+ " está REPROVADO.");
			System.out.println("Média: " + media);

		}
		
		
	}

}
