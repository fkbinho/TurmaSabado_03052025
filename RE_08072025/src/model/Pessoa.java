package model;

public class Pessoa {

	// Atributos/caracteristicas/propriedades
	private String nome;
	private String cpf;
	private int idade;
	
	// Construtor ( Método especial )
	// Polimorfismo: Sobrecarga de construtores

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = 0; // Idade padrão
	}
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	// Métodos
	
	public void exibirDados(){
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
	}
	
	// Métodos de acesso 
	
	//Getter( permite acesso ao valor atributo da classe )
	//Setter( modifica/define o valor do atributo da classe(passo um valor)
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

	
}
