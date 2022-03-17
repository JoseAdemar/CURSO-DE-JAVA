package OrientacaoAObjetos;

public class CompraTeste {
	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.itens.add(new Itens("Canetas", 20, 7.45));
		compra1.itens.add(new Itens("Borrachas", 12, 3.89));
		compra1.itens.add(new Itens("Cadernos", 10, 12.89));

		System.out.printf("%.2f",compra1.valorTotal());
		System.out.println();

		for (Itens itens : compra1.itens) {
			System.out.println(itens);
		}

	}
}
