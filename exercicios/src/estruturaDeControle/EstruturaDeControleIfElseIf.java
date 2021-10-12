package estruturaDeControle;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeControleIfElseIf {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digita a nota: ");
		double nota = sc.nextDouble();

		if (nota > 10 || nota < 0) {

			System.out.println("Nota " + nota + " inválida");
		} else if (nota >= 8.1) {
			System.out.println("Nota " + nota + " Conceito A");

		} else if (nota >= 6.1) {
			System.out.println("Nota " + nota + " Conceito B");

		} else if (nota >= 4.1) {
			System.out.println("Nota " + nota + " Conceito C");
		}

		else if (nota >= 2.1) {
			System.out.println("Nota " + nota + " Conceito D");
		}

		else {
			System.out.println("Nota " + nota + " Conceito E");
		}

		sc.close();
	}
}
