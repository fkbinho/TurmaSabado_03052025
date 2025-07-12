package model;

public abstract class Animal {
	// Atributos
	private String nome;
	
	// Construtor
	public Animal(String nome) {
		this.nome = nome;
	}
	
	// Métodos
	public void dormir() {
		System.out.println(nome + " está dormindo.");
	}
	
	public abstract void emitirSom();
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
