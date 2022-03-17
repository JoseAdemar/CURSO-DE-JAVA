package OrientacaoAObjetos;

public class Itens {

	String nome;
	int quantidade;
	double preco;

	public Itens(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Itens [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
	

}
