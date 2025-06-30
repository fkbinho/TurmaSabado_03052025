package primeiro_pacote;

import java.util.Scanner;

public class ClassePrincipal {

	// método principal
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Olá mundo. Hoje tem \"aula\"");
		
		int num = 5;
		
		//num = num + 10;
		num += 10;
		
		System.out.println(num);
		
		num++; // num = num + 1;
		
		//Operadores relacionais
		/*
		 * >   - maior que
		 * <   - menor que
		 * >=  - maior ou igual que
		 * <=  - menor ou igual que
		 * ==  - igual a
		 * !=  - diferente de
		 * 
		 * */
		
		System.out.println(num);
		System.out.println(!(num > 10) || num > 20);
		
		
		System.out.println(!true);
		
		System.out.println("---------------------------\n");
		System.out.println("Digite o nome de seu cachorro:");
		String cachorroNome = scan.nextLine();
		
		System.out.println("Qual a idade de Bob?");
		int idade = scan.nextInt();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Informe o nome Tutor:");
		String tutor = scan.nextLine();
		
		
		System.out.println("Nome:" + cachorroNome);
		System.out.println("Idade:" + idade);
		System.out.println("Tutor:" + tutor);
		
	}

}
