package projeto_imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
	private List<Construcao> catalogo = new ArrayList<>();
	
	public void adicionarConstrucao(Construcao construcao) {
		catalogo.add(construcao);
		System.out.println("Construção adicionada com sucesso.");
	}
	
	public void removerConstrucao(Construcao construcao) {
		catalogo.remove(construcao);
		System.out.println("Construção removida com sucesso.");
	}
	
	public void listarConstrucoes() {
		System.out.println("Catálogo de Construções:");
		for(int i = 0; i < catalogo.size(); i++) {
			System.out.print(i + 1 + ". ");
			catalogo.get(i).getDescricao();
			System.out.println();
		}

	}
	
	public double informarArea() {
		double areaTotal = 0.0;
		for (Construcao construcao : catalogo) {
			areaTotal += construcao.calcularArea();
		}
		return areaTotal;
	}
	
	public List<Construcao> getCatalogo() {
		return catalogo;
	}
}
