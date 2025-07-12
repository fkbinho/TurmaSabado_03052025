package projeto_imobiliaria;

public class Predio extends Imovel {
	private int numeroDeAndares;
	private double areaPorAndar;
	
	public Predio(String endereco, double preco, 
			int numeroDeAndares, double areaPorAndar) {
		super(endereco, preco);
		this.numeroDeAndares = numeroDeAndares;
		this.areaPorAndar = areaPorAndar;
	}

	@Override
	public double calcularArea() {
		return numeroDeAndares * areaPorAndar;
	}

	@Override
	public void getDescricao() {
		System.out.printf("Prédio de %d andares, localizado em %s, "
				+ "com área total de %.2fm² e preço de R$ %.2f",
				numeroDeAndares, getEndereco(), calcularArea(), getPreco());
	}

}
