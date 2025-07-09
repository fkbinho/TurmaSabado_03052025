package model;

import java.util.ArrayList;
import java.util.List;

//					superclasse/classe pai
public class Aluno extends Pessoa {
	
	//Atributos
	private String matricula;
	private List<Curso> cursos = new ArrayList<>();

	// Construtor
	public Aluno(String nome, String cpf, int idade, String matricula) {
		super(nome, cpf, idade);
		this.matricula = matricula;
	}

	//Método
	public void adicionarCurso(Curso curso) {
		if(!cursos.contains(curso)) {
			cursos.add(curso);
		}
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: " + matricula);
		
		String info = "Cursos: ";
		for(Curso curso : cursos) {
			info = info + curso.getNome() + " | ";
		}
		System.out.println(info);
	}
		
	// Getters & Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

}
