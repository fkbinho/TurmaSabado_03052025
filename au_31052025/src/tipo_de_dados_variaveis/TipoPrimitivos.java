package tipo_de_dados_variaveis;


public class TipoPrimitivos {

	public static void main(String[] args) {
		
		// Tipo de Dados Primitivos
		/* Tipos Inteiros
		 * byte
		 * short
		 * int
		 * long*/
		byte valor = 127;
		short valor1 = 32767;
		int valor2 = 612654;
		long valor3 = 548154187;
		
		System.out.println(valor);
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		
		/*Tipos Reais
		 * float
		 * double
		 * */
		
		float peso = 92.87f;
		double altura = 1.78;
		
		System.out.print(peso);
		System.out.print("\nAltura:" + altura + "\n"); // Concatenação
		
		/* Tipo lógico
		 * boolean
		 * */
		
		boolean ehManha = true; // ou false
		
		System.out.println(ehManha);
		
		/*Tipo de dados Literal
		 * char */
		
		char letra = 'M';
		
		System.out.println(letra);
	}

}
