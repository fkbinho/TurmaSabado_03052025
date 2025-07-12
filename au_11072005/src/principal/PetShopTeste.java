package principal;

import controller.Canil;
import controller.LojaPet;
import controller.PetShop;

public class PetShopTeste {

	public static void main(String[] args) {

		PetShop petShop = new PetShop();
		
		Canil canil = new Canil();
		
		LojaPet lojaPet = new LojaPet(petShop);
	
	}

}
