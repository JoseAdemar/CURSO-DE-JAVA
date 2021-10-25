package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String fala = "";

		while (!fala.equalsIgnoreCase("sair")) {

			System.out.println("Você disse: ");
			fala = sc.nextLine();

		}

		sc.close();
	}

}
