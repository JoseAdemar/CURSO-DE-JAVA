package construtor;

public class ProdutoTeste {

	public static void main(String[] args) {

		// Recebendo o construtor com argumentos
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);

		// Recebendo construtor sem argumentos
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		Double precoFinalP1 = p1.precoComDesconto();
		Double precoFinalP01 = p1.precoComDesconto(0.1);
		System.out.printf("Pre�o final notebook: R$%.2f\n",precoFinalP1);
		System.out.printf("Pre�o final notebook desconto do gerente: R$%.2f\n",precoFinalP01);
		
		Double precoFinalP2 = p2.precoComDesconto();
		System.out.printf("Pre�o final caneta: R$%.2f\n", precoFinalP2);
		
		Double mediaCarrinho = (precoFinalP1 + precoFinalP2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f", mediaCarrinho);
		

	}
}
