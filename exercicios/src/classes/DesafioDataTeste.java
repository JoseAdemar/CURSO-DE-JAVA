package classes;

public class DesafioDataTeste {

	public static void main(String[] args) {

		DesafioData data1 = new DesafioData();
		data1.dia = 25;
		data1.mes = 11;
		data1.ano = 2021;

		DesafioData data2 = new DesafioData();
		data2.dia = 01;
		data2.mes = 01;
		data2.ano = 2022;

		// chamada do metodo 01
		System.out.println(data1.obterDataFormatada01(data1.dia, data1.mes, data1.ano));
		System.out.println(data2.obterDataFormatada01(data2.dia, data2.mes, data2.ano));
		System.out.println("-----------------------------------------");

		// chamada do metodo 02
		System.out.println(data1.obterDataFormatada02());
		System.out.println(data2.obterDataFormatada02());
		System.out.println("-----------------------------------------");

		System.out.printf("Hoje é: %d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("Hoje é: %d/%d/%d", data2.dia, data2.mes, data2.ano);

	}

}
