package operadores;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/* Solicite ao usuário 3 notas e nome,
		 * façam a media, e mostre no console
		 * com duas casas decimais. 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		double nota3 = scan.nextDouble();
		scan.nextLine(); // LIMPAR O BUFFER
		
		System.out.println("Digite o nome do aluno:");
		String nome = scan.nextLine();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("%s tem a media %.2f.%n", nome, media);
		
		
		boolean status = media >= 7;
		System.out.println(status);
	}

}
