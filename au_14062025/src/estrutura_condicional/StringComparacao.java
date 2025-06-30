package estrutura_condicional;

import java.util.Scanner;

public class StringComparacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String login = "admin";
		String senha = "1234";
		
		System.out.println("Digite o login:");
		String loginDigitado = scan.nextLine();
		System.out.println("Digite a senha:");
		String senhaDigitada = scan.nextLine();
		
		if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
			System.out.println("Você logou no sistema.");
		} else {
			System.out.println("Login ou senha incorreto.");
		}
	}
}
