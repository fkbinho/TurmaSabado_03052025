package operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* Crie um programa em Java que siga as
		   etapas a seguir:
		   1) Solicite ao usuário que insira três 
		   números do tipo double*/
		
		System.out.println("Digite o primeiro numero:");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		double numero2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro numero:");
		double numero3 = scan.nextDouble();
	
		// 2) Calcule a soma desses três números
		double soma = numero1 + numero2 + numero3;
		   
		// 3) Multiplique a soma obtida por 3
		double mult = soma * 3;
		
		
		/* 4) Calcule e exiba o resto da divisão 
		   do resultado anterior por 5.
		   */
		
		int resto = (int) mult % 5;

		System.out.println("Resultado: " + resto);
	}

}
