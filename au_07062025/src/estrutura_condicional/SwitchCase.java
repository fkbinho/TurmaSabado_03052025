package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1-7:");
		int numero = scan.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Domingo!");
		break;
		case 2:
			System.out.println("Segunda!");
		break;
		case 3:
			System.out.println("Terça!");
		break;
		case 4:
			System.out.println("Quarta!");
		break;
		case 5:
			System.out.println("Quinta!");
		break;
		case 6:
			System.out.println("Sexta!");
		break;
		case 7:
			System.out.println("Sábado!");
		break;
		default:
			System.out.println("Número inválido. Digite entre 1-7.");
		}
		
//		if(numero == 1) {
//			//bloco de código
//		} else if ( numero == 2) {
//			//bloco de código
//		} else if (numero == 3) {
//			//bloco de código
//		} else {
//			System.out.println();
//		}
	}
}
