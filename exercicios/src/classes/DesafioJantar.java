package classes;

public class DesafioJantar {
	public static void main(String[] args) {

		DesafioPessoa p = new DesafioPessoa("Junior", 70.0);
		DesafioComida c = new DesafioComida("Feijoada", 0.30);

		p.comer(c);
		p.comer(c);

		System.out.println("Nome:" + p.nome + "\n" + "Peso:" + p.peso + "\n" + "Comdia: " + c.nomeDaComida + "\n"
				+ "Peso:" + c.pesoDaComida);
	}
}
