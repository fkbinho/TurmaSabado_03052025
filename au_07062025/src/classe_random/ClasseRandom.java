package classe_random;

import java.util.Random;
import java.util.Scanner;

public class ClasseRandom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		
		int numero = random.nextInt(20) + 1;
		
		double num1 =  (random.nextDouble() * 100);
		
		System.out.println(numero);
		System.out.println(num1);
		
		
	}

}
