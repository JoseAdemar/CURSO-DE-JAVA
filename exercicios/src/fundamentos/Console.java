package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		String nome = sc.next();

		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = sc.next();

		System.out.println("Informe a sua idade: ");
		int idade = sc.nextInt();

		System.out.printf("O seu nome completo é:  %s %s sua idade é: %d anos", nome, sobrenome, idade);

		sc.close();

	}
}
