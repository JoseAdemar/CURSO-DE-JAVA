package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String nome;
	List<Itens> itens = new ArrayList<>();

	public double valorTotal() {

		double valorTotal = 0;
		for (Itens itens : itens) {
			valorTotal += itens.quantidade * itens.preco;
		}
		return valorTotal;

	}

}
