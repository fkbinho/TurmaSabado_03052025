package principal;

import controller.PetShop;
import controller.ServicoAnimais;
import model.Cachorro;
import model.Gato;

public class Principal {

	public static void main(String[] args) {		
				
		Cachorro cachorro = new Cachorro("Caramelo");
		System.out.println("Nome: " + cachorro.getNome());
		cachorro.dormir();
		cachorro.emitirSom();
		
		System.out.println("---------------------");
		
		Gato gato = new Gato("Lua");
		System.out.println("Nome: " + gato.getNome());
		gato.dormir();
		gato.emitirSom();
		
		System.out.println("---------------------");
		
		ServicoAnimais petShop = new PetShop();
		petShop.darBanho(cachorro);
		petShop.darBanho(gato);
		petShop.tosar(cachorro);
		petShop.tosar(gato);
		
		
//		
//		Papagaio papagaio = new Papagaio("Loro");
//		papagaio.dormir();
//		papagaio.emitirSom();
//		papagaio.falar();
	}

}
