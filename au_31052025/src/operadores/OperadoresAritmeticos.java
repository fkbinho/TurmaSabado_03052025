package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		// Operadores Aritméticos
		/* adição -> +
		 * subtração -> -
		 * multiplicação -> *
		 * divisão -> /
		 * resto -> %
		 * */
		
		int valor1 = 8;
		int valor2 = 3;
		
		int soma = valor1 + valor2;
		System.out.println("Soma: " + soma);
		
		int subtracao = valor1 - valor2;
		System.out.println("Substração: " + subtracao);
		
		int multiplicacao = valor1 * valor2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		double divisao = (double) valor1 / valor2;
		System.out.printf("Divisão: %.2f%n", divisao); // %n -> colocar o cursor na linha de baixo
		
		int resto = valor1 % valor2;
		System.out.println("Resto: " + resto);

		
		
		System.out.println(" ---------------- ");
		
		System.out.println("m" + 1); // Concatenação
	}

}
