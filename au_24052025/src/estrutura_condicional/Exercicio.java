package estrutura_condicional;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		/* Crie um programa onde o usuario tem 
		 * que digitar duas notas, seu nome, e idade. 
		 * Calcule a média, e diga se o usuario esta:
		 * Aprovado: media >= 7.0
		 * Recuperação: media entre 4 e 6.9
		 * Reprovado: media < 4
		 * */
		
		// Atalho para importação: ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
	
		double media = (nota1 + nota2) / 2;
		
//		System.out.println("Nome: " + nome);
//		System.out.println("Idade: " + idade);
//		System.out.println("Media: " + media);
		
		String situacao = "";
		if (media >= 7) {
			if (media == 10) {
				situacao = "Aprovador com louvor!";
			} else {
				situacao = "APROVADO!";
			}
		} else if (media >= 4) {
			situacao = "RECUPERAÇÃO!";
		} else {
			situacao = "REPROVADO!";
		}
		
		System.out.printf("O aluno %s tem a idade %d anos. %n"
				+ "E sua média %.2f com a situação é %s%n", nome, idade, media, situacao);

	
	}

}
