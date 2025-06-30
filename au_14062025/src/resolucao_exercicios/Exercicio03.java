package resolucao_exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		/*
		  Crie um jogo simples de Pedra, Papel e Tesoura. 
		  O jogador escolhe uma opção
		  (Pedra, Papel, Tesoura), 
		  o computador escolhe aleatoriamente uma opção 
		  e o programa determina o vencedor.
		  
		  Regras:
		  -> Pedra ganha da Tesoura 
		  -> Tesoura ganha do Papel 
		  -> Papel ganha da Pedra
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// 1º a jogada do computador
		Random random = new Random();
		
		int jogadaComputador = random.nextInt(3); // 0 1 2 
		
		String escolhaComputador = "";
		if(jogadaComputador == 0) {
			escolhaComputador = "Pedra";
		} else if (jogadaComputador == 1) {
			escolhaComputador = "Papel";
		} else {
			escolhaComputador = "Tesoura";
		}
		
		// 2º receber a entrada usuário(escolhaJogador)
		String menu = """
				====Escolha uma opção====
				Pedra👊🏻
				Papel🖐🏻
				Tesoura✌🏻
				""";
		System.out.print(menu);
		String escolhaJogador = scan.nextLine();
		
		// fazer as verificações(ganhou, perdeu ou empate)
		if (escolhaJogador.equalsIgnoreCase(escolhaComputador)) {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + escolhaComputador);
			System.out.println("EMPATE!");
		} else if (escolhaJogador.equalsIgnoreCase("Pedra") && escolhaComputador.equalsIgnoreCase("Tesoura")
				|| escolhaJogador.equalsIgnoreCase("Papel") && escolhaComputador.equalsIgnoreCase("Pedra")
				|| escolhaJogador.equalsIgnoreCase("Tesoura") && escolhaComputador.equalsIgnoreCase("Papel")) {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + escolhaComputador);
			System.out.println("Você GANHOU!");
		} else {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + escolhaComputador);
			System.out.println("Você PERDEU!");
		}
		
	}
	
}
