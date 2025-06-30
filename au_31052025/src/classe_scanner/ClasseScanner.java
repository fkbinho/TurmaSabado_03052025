package classe_scanner;

import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = scan.nextLine();
	
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
//		scan.nextLine(); // limpa o buffer
		
		System.out.println("Digite o seu sexo (M/F): ");
		char sexo = scan.next().charAt(0); // T A D E U
		scan.nextLine();
		
		System.out.println("Digite o bairro:");
		String bairro = scan.nextLine();
		
		System.out.printf(
				"O usuário %s tem %d anos e pesa %.2f", nome, idade, peso);
		System.out.println("\nSexo: " + sexo);
		System.out.println("Bairro: " + bairro);
		System.out.println("Sobrenome: " + sobrenome);
	}

}
