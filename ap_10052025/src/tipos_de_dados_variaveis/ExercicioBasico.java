package tipos_de_dados_variaveis;

public class ExercicioBasico {

	public static void main(String[] args) {
		/* Criar variaveis com os seguinte dados:
		 * nome, idade, sexo, peso, altura
		 * e exibir no console os valores.
		 * */

		String nome = "Kleber";
		int idade = 34;
		char sexo = 'M';
		double peso = 90.8; 
		double altura = 1.78;
		
		// + -> neste caso está CONCATENANDO(juntando)
//		System.out.print("Meu nome é " + nome + "\n");
//		System.out.println("Minha idade é " + idade);
//		System.out.println("Meu sexo é " + sexo);
//		System.out.println("Meu peso é " + peso);
//		System.out.println("Meu altura é " + altura);
		
		System.out.printf("Meu nome é %s e minha idade é %d."
				+ "Meu sexo é %c."
				+ "%nMeu peso é %.2f, e minha altura %.2f.", nome, idade, sexo, peso, altura);
	}

}
