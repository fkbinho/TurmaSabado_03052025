package operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int valor = 7;
		
//		valor = valor + 3;
		valor += 3;
		System.out.println(valor);
		
		valor -= 7; // valor = valor - 7;
		System.out.println(valor);
		
		valor *= 4; // valor = valor * 4;
		System.out.println(valor);
		
		valor /= 3; // valor = valor / 3;
		System.out.println(valor);
		
		valor %= 2; // valor = valor % 2;
		System.out.println(valor);
		
	}

}
