package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double f = 0.0;
		final int AJUSTE = 32;
		final double DIVISOR = 5.0 / 9.0;
		double calculo = 0.0;
		double resultado = 0.0;

		System.out.println("Valor em �F ?");
		f = sc.nextDouble();
		calculo = (f - AJUSTE) * DIVISOR;

		resultado = calculo;

		System.out.printf("Conversa�o para Celius: %.2f �C", resultado);

		sc.close();

	}
}
