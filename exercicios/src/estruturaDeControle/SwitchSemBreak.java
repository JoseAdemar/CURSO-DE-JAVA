package estruturaDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		/*
		 * Sem utilizar o break o valor informado na variavel diasDaSemana tudo abaixo
		 * dela ser� executado e lido pelo programa.
		 * 
		 */

		int diasDaSemana = 1;

		switch (diasDaSemana) {

		case 1:
			System.out.println("Segunda");

		case 2:
			System.out.println("Ter�a");

		case 3:
			System.out.println("Quarta");

		case 4:
			System.out.println("Quinta");

		case 5:
			System.out.println("Sexta");

		case 6:
			System.out.println("S�bado");

		case 7:
			System.out.println("Domingo");

		}
	}
}
