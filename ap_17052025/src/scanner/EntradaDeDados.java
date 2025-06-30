package scanner;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt(); 
		scan.nextLine();
		
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine(); // captura a próxima linha(texto)
//		String nome = scan.next(); // captura a proxima string(ignora espaço, enter...)
//		scan.nextLine(); // limpar o BUFFER
		
		System.out.println("Digite o peso:");
		double peso = scan.nextDouble();
		
		System.out.printf("%s tem %d anos e pesa %.2fkg", 
				nome, idade, peso);
		
		
		scan.close();
			
	}
}












