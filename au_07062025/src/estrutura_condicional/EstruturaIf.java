package estrutura_condicional;

import java.util.Scanner;

public class EstruturaIf {
	public static void main(String[] args) {
		
		// IF - simples
		/*
		 * if (condicao) {
		 * 		bloco de código
		 * }
		 * */
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite um numero:");
//		int numero = scan.nextInt();
//		scan.nextLine();
//		
//		if (numero < 20) {
//			System.out.println(numero + " é menor que 20");
//		} else if(numero == 20) {
//			System.out.println(numero + " é igual a 20");
//		} else {
//			System.out.println(numero + " é maior que 20");
//		}
		
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		
//		if (idade >= 18 && idade < 65) {
//			System.out.println("Voto Obrigatório.");
//		} else if (idade >= 16 || idade >= 65) {
//			System.out.println("Voto Facultativo.");
//		} else {
//			System.out.println("Você não pode votar!");
//		}
		
		String mensagem = (idade >= 18 && idade < 65) ? "Voto Obrigatório." : 
						  (idade >= 16 || idade >= 65) ? "Voto Facultativo." :
						  "Você não pode votar!";
		
//		if (idade >= 18) {
//			System.out.println("Você é maior de idade");
//		} else {
//			System.out.println("Menor de idade.");
//		}
		
//		String mensagem = 
//				(idade >= 18) ? "Você é maior de idade" : "Menor de idade.";
//		
		System.out.println(mensagem);
	}
}
