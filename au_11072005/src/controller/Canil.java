package controller;

import model.Animal;

public class Canil implements ServicoAnimais {

	@Override
	public void darBanho(Animal animal) {
		System.out.println("Dando banho no animal: " + animal.getNome());
	}

	@Override
	public void tosar(Animal animal) {
		System.out.println("Tosando o animal: " + animal.getNome());
	}

	
}
