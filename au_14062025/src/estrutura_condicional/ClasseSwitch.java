package estrutura_condicional;

import java.util.Scanner;

public class ClasseSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		switch case tradicional
//		switch (expressao) {
//		case valor1:
//			// bloco de código
//		break;
//		case valor2:
//			// bloco de código
//		break;
//		case valor3:
//			// bloco de código
//		break;
//		.
//		.
//		.
//		default:
//			// bloco de código
//		}
		
//		System.out.println("Digite um número entre 1-7:");
//		int numero = scan.nextInt();
//		
//		switch(numero) {
//		case 1 -> System.out.println("Domingo!");
//		case 2 -> System.out.println("Segunda!");
//		case 3 -> System.out.println("Terça!");
//		case 4 -> System.out.println("Quarta!");
//		case 5 -> System.out.println("Quinta!");
//		case 6 -> System.out.println("Sexta!");
//		case 7 -> System.out.println("Sábado!");
//		default -> System.out.println("Número inválido. Digite entre 1-7.");
//		}
		
//		System.out.println("Digite um número entre 1-12:");
//		String mes = scan.next().toLowerCase();
//		
//		switch(mes) {
//		case "janeiro", "fevereiro", "março" -> 
//			System.out.printf("Você digitou %s, e pertece ao 1º trimestre.", mes);
//		case "abril", "maio", "junho" ->
//			System.out.printf("Você digitou %s, e pertece ao 2º trimestre.", mes);
//		case "julho", "agosto", "setembro" ->
//			System.out.printf("Você digitou %s, e pertece ao 3º trimestre.", mes);
//		case "outubro", "novembro", "dezembro" ->
//			System.out.printf("Você digitou %s, e pertece ao 4º trimestre.", mes);
//		default -> System.out.println("Valor inválido.");
//		}
		
//		switch(mes) {
//		case 1: 
//		case 2:
//		case 3:
//			System.out.printf("Você digitou %d, e pertece ao 1º trimestre.", mes);
//		break;
//		case 4, 5, 6:
//			System.out.printf("Você digitou %d, e pertece ao 2º trimestre.", mes);
//		break;
//		case 7, 8, 9:
//			System.out.printf("Você digitou %d, e pertece ao 3º trimestre.", mes);
//		break;
//		case 10, 11, 12:
//			System.out.printf("Você digitou %d, e pertece ao 4º trimestre.", mes);
//		break;
//		default:
//			System.out.println("Valor inválido.");
//		}
		
		
		System.out.println("Digite um número entre 1-7:");
		int numero = scan.nextInt();
		
		String dia = switch(numero) {
			case 1 -> "Domingo!";
			case 2 -> "Segunda!";
			case 3 -> "Terça!";
			case 4 -> "Quarta!";
			case 5 -> "Quinta!";
			case 6 -> "Sexta!";
			case 7 -> "Sábado!";
			default -> "Número inválido. Digite entre 1-7.";
		};
		System.out.println(dia);
		
		System.out.println("Digite um número entre 1-12:");
		int mes = scan.nextInt();
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tem 31 dias");
		case 4, 6, 9, 11 -> System.out.println("Tem 30 dias");
		case 2 -> System.out.println("Tem 28 dias. Se for bissexto tem 29 dias");
		default -> System.out.println("Valor inválido");
		}
	}

}
