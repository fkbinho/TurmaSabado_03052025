package controller;

import model.Animal;

public class LojaPet {

	ServicoAnimais servicoAnimais;
	
	public LojaPet(ServicoAnimais servicoAnimais) {
		this.servicoAnimais = servicoAnimais;
	}
	
	public void darBanho(Animal animal) {
		servicoAnimais.darBanho(animal);
	}
	
	
}
