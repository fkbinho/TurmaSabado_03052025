package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero(0-7):");
		int numero = scan.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Domingo!");
		break;
		case 2:
			System.out.println("Segunda!");
		break;
		case 3:
			System.out.println("Terça-feira");
		break;
		case 4:
			System.out.println("Quarta-feira");
		break;
		case 5:
			System.out.println("Quinta-feira");
		break;
		case 6:
			System.out.println("Sexta-feira");
		break;
		case 7:
			System.out.println("Sábado");
		break;
		default:
			System.out.println("Opção inválida");
		}

	}

}
