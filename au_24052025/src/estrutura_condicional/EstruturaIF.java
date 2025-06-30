package estrutura_condicional;

import java.util.Scanner;

public class EstruturaIF {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18 && idade < 65) {
			System.out.println("Você tem que Votar.");
		} else if(idade >= 16) {
			System.out.println("Você pode votar.");
		} else {
			System.out.println("Você não pode votar!");
		}
		
		//fora do if
		System.out.println("Programa finalizado!");
		
	}
}
