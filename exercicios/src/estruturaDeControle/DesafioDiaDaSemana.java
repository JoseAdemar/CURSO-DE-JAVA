package estruturaDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um dia da semana");
		String semana = sc.next();

		if (semana.equalsIgnoreCase("Segunda")) {
			System.out.println("1");

		} else if (semana.equalsIgnoreCase("Terça")) {
			System.out.println("2");

		} else if (semana.equalsIgnoreCase("Quarta")) {
			System.out.println("3");

		} else if (semana.equalsIgnoreCase("Quinta")) {
			System.out.println("4");

		} else if (semana.equalsIgnoreCase("Sexta")) {
			System.out.println("5");

		} else if (semana.equalsIgnoreCase("Sábado")) {
			System.out.println("6");

		} else if (semana.equalsIgnoreCase("Domingo")) {
			System.out.println("7");

		} else {
			System.out.println("O dia da semana é inválido");
		}

		sc.close();
	}
}
