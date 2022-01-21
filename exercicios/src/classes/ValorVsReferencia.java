package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuicao por valor (primitivo)
		System.out.println(a + "-----" + b);

		a++;
		b--;
		System.out.println(a + "-----" + b);

		DesafioData  d1 = new DesafioData() ;
		
		d1.dia = 01;
		d1.mes = 01;
		d1.ano = 2022;
		
		DesafioData d2 = new DesafioData();
		d2 = d1; // atribuicao por referencia (objeto)
		System.out.println(d2.obterDataFormatada02());
		
		voltarDataParaValorPadrao(d2);
		System.out.println(d2.obterDataFormatada02());
		
	}
	
	public static void voltarDataParaValorPadrao(DesafioData d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
