package operadores;

public class OperadoresMatematicos {

	public static void main(String[] args) {

		// Operadores matemáticos
		/*
		 * + -> soma 
		 * - -> subtração 
		 * * -> multiplicação 
		 * / -> divisão 
		 * % -> resto
		 */

		int valor1 = 8;
		int valor2 = 3;

		// SOMA
		int soma = valor1 + valor2;
		// Concatenando texto com valor inteiro
		System.out.println("Soma: " + soma);

		// SUBTRAÇÃO
		int subtracao = valor1 - valor2;
		System.out.println("Subtração: " + subtracao);

		// MULTIPLICAÇÃO
		int multiplicacao = valor1 * valor2;
		System.out.println("Multiplicação: " + multiplicacao);

		// DIVISÃO
		// casting
		double divisao = (double) valor1 / valor2;
		System.out.printf("Divisão: %.2f %n", divisao);

		// RESTO
		int resto = valor1 % valor2;
		System.out.println("Resto: " + resto);

	}

}
