package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas: ");
		int quantidadeDeNotas = sc.nextInt();

		double[] arrayDeNotas = new double[quantidadeDeNotas];

		for (int i = 0; i < arrayDeNotas.length; i++) {

			System.out.println("Informe a nota " + (i + 1 + " "));
			arrayDeNotas[i] = sc.nextDouble();

		}

		double totalNotas =0.0;
		for (double notas : arrayDeNotas) {
			totalNotas += notas;
		}
		
		System.out.println("A média é: " + (totalNotas / arrayDeNotas.length));
		sc.close();
	}
}
