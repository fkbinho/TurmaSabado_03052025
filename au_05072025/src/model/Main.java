package model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Informe a Marca do veiculo:");
//		String marca = scan.nextLine();
//		
//		System.out.println("Informe a Modelo do veiculo:");
//		String modelo = scan.nextLine();
//		
//		System.out.println("Informe o ano do veiculo:");
//		int ano = scan.nextInt();
//		
//		System.out.println("Informe o cilindrada do veiculo:");
//		int cilindrada = scan.nextInt();
//		
		
		Moto moto = new Moto("Honda", "XRE", 2021, 300);
		moto.setMarca("Yamaha");
		moto.setModelo("Fazer");
		moto.setAno(2019);
		
		moto.exibirDados();
//		
//		Carro carro1 = new Carro(marca, modelo, ano, quantidadePortas);
//		carro1.exibirDados();
//		carro1.ligar();
//		carro1.desligar();

//		System.out.println("-----------------");
//		Carro carro2 = new Carro();
//		carro2.marca = "Honda";
//		carro2.modelo = "Civic";
//		carro2.ano = 2021;
//		System.out.println(carro2.marca);
//		System.out.println(carro2.modelo);
//		System.out.println(carro2.ano);
//		carro2.ligar();
//		carro2.desligar();
//
//		System.out.println("-----------------");
//      Carro carro3 = new Carro();
//      carro3.marca = "Ford";
//      carro3.modelo = "Focus";
//      carro3.ano = 2019;
//      System.out.println("-----------------");
//      System.out.println(carro3.marca);
//      System.out.println(carro3.modelo);
//      System.out.println(carro3.ano);

	}

}
