package resolucao_exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		 /* 
		 * Crie um programa que leia quatro 
		 * números inteiros e diga qual o maior
		 * e o menor número dentre eles.
		 * Depois, calcule e mostre a diferença 
		 * entre o maior e o menor.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º número:");
		int num1 = scan.nextInt();
		System.out.println("Digite o 2º número:");
		int num2 = scan.nextInt();
		System.out.println("Digite o 3º número:");
		int num3 = scan.nextInt();
		System.out.println("Digite o 4º número:");
		int num4 = scan.nextInt();
		
		
//		int maior = 0;
//		if (num1 > num2 && num1 > num3 && num1 > num4) {
//			maior = num1;
//		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
//			maior = num2;
//		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
//			maior = num3;
//		} else {
//			maior = num4;
//		}
//		
//		int menor = 0;
//		if (num1 < num2 && num1 < num3 && num1 < num4) {
//			menor = num1;
//		} else if(num2 < num1 && num2 < num3 && num2 < num4) {
//			menor = num2;
//		} else if (num3 < num1 && num3 < num2 && num3 < num4) {
//			menor = num3;
//		} else {
//			menor = num4;
//		}
		
//		int maior = num1;
//		int menor = num1;
		
		// verificando qual o maior número
//		if (num2 > maior) {
//			maior = num2;
//		}
//		if (num3 > maior) {
//			maior = num3;
//		}
//		if (num4 > maior) {
//			maior = num4;
//		}
		
		// verificando qual o menor
//		if (num2 < menor) {
//			menor = num2;
//		}
//		if (num3 < menor) {
//			menor = num3;
//		}
//		if (num4 < menor) {
//			menor = num4;
//		}
		
		int maior = Math.max(num4, Math.max(num3, Math.max(num1, num2)));
		int menor = Math.min(num1, Math.min(num2, Math.min(num3, num4)));
		
		int diferenca = maior - menor;
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A diferença entre eles é: " + diferenca);
	}
}
