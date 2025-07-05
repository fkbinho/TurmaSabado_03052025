package model;

public class Carro extends Veiculo {

	int quantidadePortas;

	public Carro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}

	@Override //sobreescrever
	public void exibirDados() {
		super.exibirDados();
		System.out.println(quantidadePortas);
	}
	

}
