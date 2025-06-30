package resolucao_exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 /* 
		 * Escreva um programa para encontrar
		 * o maior número dentre três números
		 * fornecidos pelo usuário.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		// solicitando entrada ao usuário
		System.out.println("Digite o 1º número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = scan.nextInt();
		System.out.println("Digite o 3º número: ");
		int numero3 = scan.nextInt();
		
//		if (numero1 > numero2 && numero1 > numero3) {
//			System.out.printf("%d é o maior.", numero1);
//		} else if (numero2 > numero1 && numero2 > numero3) {
//			System.out.printf("%d é o maior.", numero2);
//		} else {
//			System.out.printf("%d é o maior.", numero3);	
//		}
		
		int maior = 0;

		if (numero1 > numero2) {
			if(numero1 > numero3) {
				maior = numero1;
			} else {
				maior = numero3;
			}
		} else {
			if (numero2 > numero3) {
				maior = numero2;
			} else {
				maior = numero3;
			}
		}
		
		System.out.printf("%d é o maior número.", maior);
	
	}
}
