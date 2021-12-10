package classes;

public class DesafioData {

	Integer dia;
	Integer mes;
	Integer ano;

	// metodo 01
	public String obterDataFormatada01(int dia, int mes, int ano) {

		return "Hoje é: " + dia + "/" + mes + "/" + ano;

	}

	// metodo 02
	public String obterDataFormatada02() {

		return String.format("Hoje é: %d/%d/%d", dia, mes, ano);
	}
}
