package construtor;

public class DesafioDataConstrutor {

	Integer dia;
	Integer mes;
	Integer ano;

	public DesafioDataConstrutor() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 1970;

	}

	public DesafioDataConstrutor(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// metodo 01
	public String obterDataFormatada01(int dia, int mes, int ano) {

		return "Hoje é: " + dia + "/" + mes + "/" + ano;

	}

	// metodo 02
	public String obterDataFormatada02() {

		return String.format("Hoje é: %d/%d/%d", dia, mes, ano);
	}
}
