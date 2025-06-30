package operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int idade1;
		int idade2;
		
		idade1 = 18;
		idade2 = 24;
		
		boolean maiorQue = idade1 > idade2;
		System.out.println(maiorQue);
		
		boolean menorQue = idade1 < idade2;
		System.out.println(menorQue);
		
		boolean igualA = idade1 == idade2;
		System.out.println(igualA);
		
		boolean diferenteDe = idade1 != idade2;
		System.out.println(diferenteDe);
		
		boolean maiorOuIgual = idade1 >= idade2;
		System.out.println(maiorOuIgual);

		boolean menorOuIgual = idade1 <= idade2;
		System.out.println(menorOuIgual);
	}

}
