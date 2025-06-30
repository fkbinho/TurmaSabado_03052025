package operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 10;
		
		boolean resultado = num1 > num2;
		System.out.println(resultado);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		

		
		System.out.println("________________________");
		// Operadores Lógicos
		
		//					  false    ||     true
		
		resultado = num1 > num2 || num1 < num2;
		System.out.println(resultado);
		
		System.out.println(num1 > num2 && num1 < num2);
		
		System.out.println(num1 > num2 
						   && num1 < num2 
						   || num1 <= num2);
//		int num1 = 7;
//		int num2 = 10;
		
		System.out.println(!(num1 <= num2) //   f
						   || num1 > num2  //   f
						   && num1 < num2  //   v
				   );
	}
}
