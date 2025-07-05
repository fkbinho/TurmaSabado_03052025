package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;

	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    public void desligar() {
        System.out.println("O carro " + modelo + "  está desligado.");
    }
	
    public void exibirDados() {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
 
}
