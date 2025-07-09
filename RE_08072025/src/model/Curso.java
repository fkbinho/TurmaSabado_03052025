package model;

import java.util.List;

public class Curso {
	
	private String nome;
	private String codigo;
	private Professor profResponsavel;
	private List<Aluno> alunosMatriculados;
	
	public Curso(String nome, String codigo, Professor profResponsavel, List<Aluno> alunosMatriculados) {
		this.nome = nome;
		this.codigo = codigo;
		this.profResponsavel = profResponsavel;
		this.alunosMatriculados = alunosMatriculados;
	}

//	public void exibirDados() {
//		
//	}


	// getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Professor getProfResponsavel() {
		return profResponsavel;
	}

	public void setProfResponsavel(Professor profResponsavel) {
		this.profResponsavel = profResponsavel;
	}

	public List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	
}
