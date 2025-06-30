package estrutura_condicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/* Solicite ao usuário um numero inteiro
		 * e diga se é ímpar ou par.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
//		if (numero % 2 == 0) {
//			System.out.println("É PAR!");
//		} else {
//			System.out.println("É ÍMPAR!");
//		}
		
		String mensagem = 
				(numero % 2 == 0) ? "É par!" : "É Ímpar!";
		System.out.println(mensagem);
	}
}
