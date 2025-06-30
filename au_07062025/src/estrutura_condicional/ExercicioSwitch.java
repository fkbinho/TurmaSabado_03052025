package estrutura_condicional;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {

		/*
		 * Solicite um numero ao usuario
		 * entre 1 - 12 (onde cada numero refere-se
		 * a um mês)
		 * E Diga em qual trimestre ele está.
		 * 
		 * */
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número entre 1-12:");
		int mes = scan.nextInt();
		
		switch(mes) {
		case 1, 2, 3 -> {
			System.out.println("Janeiro/Fevereiro/Março\n1º trimestre.");
			System.out.println("Outono.");
		}
		case 4, 5, 6 -> System.out.println("Abril/Maio/Junho\n2º trimestre.");
		case 7, 8, 9 -> System.out.println("Julho/Agosto/Setembro\n3º trimestre.");
		case 10, 11, 12 -> System.out.println("Outubro/Novembro/Dezembro\n4º trimestre.");
		default -> System.out.println("Valor inválido.");
		}
		
		
		
		
	}

}
