package operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*10) Faça um algoritmo que leia a 
		 * largura e altura de uma parede, calcule 
		 * e mostre a área a ser pintada e a 
		 * quantidade de tinta necessária 
		 * para o serviço, sabendo que cada 
		 * litro de tinta pinta uma área de 
		 * 2 metros quadrados.*/
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a altura:");
		double altura = scan.nextDouble();
		
		System.out.println("Informe a largura:");
		double largura = scan.nextDouble();
		
		double area = altura * largura;
		
		double qtdLitro = area / 2;
		
		System.out.printf("Você precisa de %.2fL de tinta", 
				qtdLitro);
		System.out.println();
		System.out.println(Math.round(qtdLitro));
		
		// Métodos para Arredondar valores:
		/* math.round(x) -> arredondamento tradicional
		 * math.ceil(x) -> arredonda para cima
		 * math.floor(x) -> arredonda para baixo
		 */
//		System.out.println();
//		System.out.println(Math.PI);
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.sqrt(121));
	}

}
