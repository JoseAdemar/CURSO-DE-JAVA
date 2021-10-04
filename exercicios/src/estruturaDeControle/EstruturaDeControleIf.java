package estruturaDeControle;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeControleIf {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a média: ");
		double media = sc.nextDouble();

		if (media <= 10 && media >= 7) {

			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}

		if (media < 7 && media >= 4.5) {

			System.out.println("Recuperação");
		}

		boolean criterioReprovacao = media < 4.5 && media >= 0;

		if (criterioReprovacao) {
			System.out.println("Reprovado");
		}

		sc.close();
	}
}
