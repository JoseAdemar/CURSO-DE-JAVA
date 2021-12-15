package construtor;

public class Produto {

	String nome;
	Double preco;
	Double desconto;

	// Construtor com argumentos
	public Produto(String nome, Double preco, Double desconto) {

		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	// Construtor sem argumentos
	public Produto() {
		
	}
	
	// Metodo
	public Double precoComDesconto() {
		
		 return this.preco * (1 - this.desconto);
	}
	
	// Metodo
	public Double precoComDesconto(double descontoDoGerente) {
		
		 return this.preco * (1 - this.desconto - descontoDoGerente);
	}
	
	
}
