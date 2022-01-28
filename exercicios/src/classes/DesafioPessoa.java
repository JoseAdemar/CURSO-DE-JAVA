package classes;

public class DesafioPessoa {

	String nome;
	double peso;

	public DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public void comer(DesafioComida desafioComida) {

		if (desafioComida != null) {
			this.peso += desafioComida.pesoDaComida;

		}
	}

}
