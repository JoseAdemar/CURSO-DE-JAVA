package OrientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public final String nome;
	public final List<Compra> compras = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	// Método adicionar compra
	public void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	// Metodo obter valor total de todas as compras
	public double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}

}
