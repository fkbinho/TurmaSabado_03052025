package projeto_imobiliaria;

public class Casa extends Imovel {
	private double largura;
	private double comprimento;
	
	public Casa(String endereco, double preco, 
			double largura, double comprimento) {
		super(endereco, preco);
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public double calcularArea() {
		return largura * comprimento;
	}

	@Override
	public void getDescricao() {
		System.out.printf("Casa localizada em %s, "
				+ "com área de %.2fm² e preço de R$ %.2f", 
				getEndereco(), calcularArea(), getPreco());
	}

}
