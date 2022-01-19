package classes;

public class Produto {

	String nome;
	Double preco;
	static Double desconto = 0.25;

	// Construtor com argumentos
	public Produto(String nome, Double preco) {

		this.nome = nome;
		this.preco = preco;
	}

	// Construtor sem argumentos
	public Produto() {

	}

	// Metodo
	public Double precoComDesconto() {

		return this.preco * (1 - desconto);
	}

	// Metodo
	public Double precoComDesconto(double descontoDoGerente) {

		return this.preco * (1 - desconto - descontoDoGerente);
	}

}
