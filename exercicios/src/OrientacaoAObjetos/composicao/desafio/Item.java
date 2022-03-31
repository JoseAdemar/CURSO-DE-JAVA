package OrientacaoAObjetos.composicao.desafio;

public class Item {

	public Produto produto;
	public Integer quantidade;

	// Construtor com argumentos
	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	// Construtor sem argumentos
	public Item() {

	}
}
