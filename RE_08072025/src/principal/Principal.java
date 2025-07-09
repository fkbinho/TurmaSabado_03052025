package principal;

import model.Aluno;
import model.Curso;
import model.Pessoa;

public class Principal {
	
	// Método principal da aplicação
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Kleber", "12345678900", 20);
	
		Aluno aluno = new Aluno("Tadeu", "5189651865", 38, "0010");
		
		aluno.exibirDados();
		
		System.out.println("-------------------");
		
		Curso curso1 = new Curso("Programação Python", "PY101", null, null);
		Curso curso2 = new Curso("Programação Java", "JAVA101", null, null);
		
		aluno.adicionarCurso(curso1);
		aluno.adicionarCurso(curso2);
		aluno.exibirDados();
		

		
		
		
//
//		List<String> nomes = new ArrayList<>();
//		
//		nomes.add("Tadeu");
//		nomes.add("Bruno");
//		nomes.add("Kleber");
//		nomes.add("Fabi");
//		nomes.add("Ana");
//		
//		List<String> nomes1 = new ArrayList<>();
//		
//		nomes1.add("Tati");
//		nomes1.add("Dany");
//		nomes1.add("Pedro");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		nomes1.add("Snow");
//		
//		nomes = nomes1;
//		
//		System.out.println(nomes);
//		
//		System.out.println(nomes);
//		
//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
//		
//		System.out.println("---------------");
//		
//		//for each
//		//for(para cada nome(elemento) da lista nomes "faça algo"
//		for(String nome : nomes) {
//			System.out.println(nome);
//		}
		
	}

}
