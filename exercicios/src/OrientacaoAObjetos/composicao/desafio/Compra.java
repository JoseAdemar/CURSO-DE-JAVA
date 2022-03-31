package OrientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	public final List<Item> itens = new ArrayList<>();

	// Método adicionar itens
	public void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}

	// Método adicionar itens 2
	public void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}

	// Método obter valor total
	public double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}
}
