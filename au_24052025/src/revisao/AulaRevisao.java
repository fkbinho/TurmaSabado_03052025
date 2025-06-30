package revisao;

import java.util.Scanner;

//Classe principal
public class AulaRevisao {
	//Método principal
	public static void main(String[] args) {
		
		// Tipo de dados e Variáveis
		
		/* Tipo Primitivo - INTEIRO
		 * int
		 * byte
		 * short
		 * long]
		 * 
		 * Tipo Primitivo - Ponto Flutuante (casas decimais)
		 * float
		 * double
		 * */

		// short, byte -> TAMANHOS MENORES
		int idade = 33;
		long ano = 2025;
		
		float peso = 1.68f;
		double altura = 1.78;
		
		// Tipo Textual - char ( Caractere )
		char sexo = 'M';
		
		// Tipo de Dados  NÃO primitivo - Classe String
		String nome = "Kleber";

		// Tipo Lógico - booleanos
		boolean eManhã = true; // false
		
		/* Operadores Aritmeticos
		  + -> soma
		  - -> subtração 
		  * -> multiplicação
		  / -> divisão
		  % -> resto
		  */
		
		int valor1 = 8;
		int valor2 = 3;
		
		int soma = valor1 + valor2;
		System.out.println("Soma1 = " + soma); // + -> concatenação
		
		int valor3 = 2;
		soma = soma + valor3;
//		soma += valor3;
		System.out.println("Soma2 = " + soma);
		
		int multiplicacao = valor1 * valor2;
		System.out.println("Multiplicação = " + multiplicacao);
		
		int subtracao = valor1 - valor2;
		System.out.println("Subtração = " + subtracao);
		
		//			   	CASTING
		double divisao = (double) valor1 / valor2;
		System.out.printf("Divisão = %.3f", divisao);
		
		int resto = valor1 % valor2;
		System.out.println("\nResto = " + resto);
		
		// Operadores de Atribuição
		
		valor1 += 3; // valor1 = valor1 + 3;
		System.out.println(valor1);
		
		valor2 -= 2; // valor2 = valor2 - 2;
		System.out.println(valor2);
		
		valor1 *= 2; // valor1 = valor1 * 2;
		System.out.println(valor1);
		
		valor1 /= 2; // valor1 = valor1 / 2;
		System.out.println(valor1);
		
		valor2 %= 2; // valor2 = valor2 % 2;
		System.out.print(valor2);
		
		System.out.println("\n---------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome:");
//		String nome2 = scan.nextLine();
//		
//		System.out.println("Digite o sobrenome:");
//		String sobrenome = scan.next();
//		scan.nextLine();
//		
//		System.out.println("Digite sua idade:");
//		int idade2 = scan.nextInt();		
//		
//		System.out.println("Digite sua altura:");
//		double altura2 = scan.nextDouble();
//		scan.nextLine();
//		
//		System.out.println("Digite seu sexo (M/F):");
//		char sexo2 = scan.nextLine().charAt(0);
//		
//		System.out.println("Nome: " + nome2);
//		System.out.println("Sobrenome: " + sobrenome);
//		System.out.println("Idade: " + idade2);
//		System.out.println("Altura: " + altura2);
//		System.out.println("Sexo: " + sexo2);

		System.out.println("----------------------------------------------");
		// Operadores Relacionais
		
		int numero1 = 16;
		int numero2 = 18;
		
		boolean resultado = numero1 > numero2;
		System.out.println(resultado);
		
		resultado = numero1 < numero2;
		System.out.println(resultado);
		
		resultado = numero1 >= numero2;
		System.out.println(resultado);
		
		System.out.println(numero1 <= numero2);
		System.out.println(numero1 != numero2);
		System.out.println(numero1 == numero2);
		
							// operador OU
		resultado = numero1 > numero2 || numero1 == numero2;
		System.out.println(resultado);
		
		resultado = numero1 > numero2 || numero1 < numero2;
		System.out.println(resultado);
		
		resultado = numero1 >= numero2 && numero1 <= numero2;
		System.out.println(resultado);
		
		resultado = numero1 >= numero2 && !(numero1 <= numero2);
		System.out.println(resultado);
		
		System.out.println("---------------------------------------------------");
		// Operador unário
		
		int ano2 = 2025;
		
		// Operador unário soma
//		ano2 = ano2 + 1;
//		ano2++;
		
		// Operador unário subtração
//		ano2--;
//		--ano2;
		
		System.out.println(--ano2);	
		
		


		
	}

}
