package classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.53;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		Double precoFinalP1 = p1.preco * (1 - p1.desconto);
		System.out.printf("Pre�o final notebook: R$%.2f\n",precoFinalP1);
		
		Double precoFinalP2 = p2.preco * (1 - p2.desconto);
		System.out.printf("Pre�o final caneta: R$%.2f\n", precoFinalP2);
		
		Double mediaCarrinho = (precoFinalP1 + precoFinalP2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f", mediaCarrinho);
		

	}
}
