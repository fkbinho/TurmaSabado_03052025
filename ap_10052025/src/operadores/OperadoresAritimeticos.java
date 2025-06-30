package operadores;

public class OperadoresAritimeticos {

	// método principal
	public static void main(String[] args) {
		
		/* 
		  + -> soma
		  - -> subtração
		  * -> multiplicação
		  / -> divisão
		  % -> resto
		 * */
		
		int numero1 = 8;
		int numero2 = 3;
		
		int soma = numero1 + numero2;
		System.out.println("A Soma é: " + soma);
		
		int subtracao = numero1 - numero2;
		System.out.println("A Subtração é: " + subtracao);
		
		int multiplicacao = numero1 * numero2;
		System.out.println("A Multiplicação é: " + multiplicacao);
		
		// CASTING - CONVERTENDO -> numero1 = 8.0
		double divisao = (double) numero1 / numero2;
		System.out.printf("A Divisão é: %.2f%n", divisao);
		
		int resto = numero1 % numero2;
		System.out.println("O resto é: " + resto);

	}
}
