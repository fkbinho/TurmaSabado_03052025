package model;

public class Moto extends Veiculo {

	private int cilindrada;

	public Moto(String marca, String modelo, int ano, int cilindrada) {
		super(marca, modelo, ano);
		this.cilindrada = cilindrada;
	}
	
	@Override // sobreencrever
	public void exibirDados() {
		super.exibirDados();
		System.out.println(cilindrada);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
}
