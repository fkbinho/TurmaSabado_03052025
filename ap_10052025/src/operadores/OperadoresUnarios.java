package operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int x = 1;

				   // 1 + 1 = 2
		// x++ -> x = x + 1;
		System.out.println(x++); // 1, 2, 2, 2
		
		System.out.println(x);	 // 2, 1, 2, 1
		
		System.out.println(++x); // 3, NS, 2, -2
		
		int y = 2;
		
		System.out.println(--y); // 1, 0
		System.out.println(y);   // 1, 2, -2
		System.out.println(y--);// 1, 0, -1 , 3
		System.out.println(y);
		
		
		
		System.out.println("---------------------------");
		
		int a = 10;
		int b = 20;

						//  10 + 19  + 12  - 19
		System.out.println(a++ + --b + ++a - b--);
		
	}
}
