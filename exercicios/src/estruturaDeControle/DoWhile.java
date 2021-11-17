package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Fale a senha: ");
			texto = sc.nextLine();

		} while (!texto.equalsIgnoreCase("Por favor"));

		System.out.println("Obrigado !!!");

		sc.close();

	}
}
