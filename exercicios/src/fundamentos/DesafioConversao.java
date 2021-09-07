package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Primeiro sal�rio: ");
		String salario1 = sc.next().replaceAll(",", ".");

		System.out.println("Segundo sal�rio: ");
		String salario2 = sc.next().replaceAll(",", ".");

		System.out.println("Terceiro sal�rio: ");
		String salario3 = sc.next().replaceAll(",", ".");

		double salary1 = Double.parseDouble(salario1);
		double salary2 = Double.parseDouble(salario2);
		double salary3 = Double.parseDouble(salario3);

		double media = (salary1 + salary2 + salary3) / 3;

		System.out.printf("M�dia =  %.2f", media);
		//System.out.println("A m�dia � = " + media);

		sc.close();

	}
}
