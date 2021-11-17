package estruturaDeControle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double soma = 0.0;
		double nota = 0.0;

		while (nota <= 10 || nota >= 0) {

			System.out.println("Informe a nota: ");
			nota = sc.nextDouble();
			cont += 1;
			soma += nota;

			if (nota == -1) {

				double media = (soma + 1) / (cont - 1);
				System.out.println("Media = " + media);
				System.out.println("Fim do programa");
				break;
			}

			if (nota > 10 || nota < 0) {
				System.out.println("Valor inválido");
			}

		}

		sc.close();
	}
}
