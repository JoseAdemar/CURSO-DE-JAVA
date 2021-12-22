package construtor;

public class DesafioDataConstrutorTeste {

	public static void main(String[] args) {

		DesafioDataConstrutor data1 = new DesafioDataConstrutor();
		data1.dia = 25;
		data1.mes = 11;
		data1.ano = 2021;

		DesafioDataConstrutor data2 = new DesafioDataConstrutor();
		data2.dia = 01;
		data2.mes = 01;
		data2.ano = 2022;
		
		DesafioDataConstrutor data3 = new DesafioDataConstrutor();
		System.out.println(data3.obterDataFormatada02());
		
		DesafioDataConstrutor data4 = new DesafioDataConstrutor(21, 12, 2021);
		System.out.println(data4.obterDataFormatada02());
		

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
