package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MatrizArrays {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantidade de alunos: ");
		int quantidadeDeAluno = scanner.nextInt();

		System.out.println("Quantas notas por aluno: ");
		int quantidadeDeNotasPorAluno = scanner.nextInt();

		double[][] notasDaTurma = new double[quantidadeDeAluno][quantidadeDeNotasPorAluno];

		double totalDeNotas = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = scanner.nextDouble();
				totalDeNotas += notasDaTurma[a][n];

			}

		}

		double mediaDasNotasDaTurma = totalDeNotas / (quantidadeDeAluno * quantidadeDeNotasPorAluno);
		System.out.println("Média da turma é: " + mediaDasNotasDaTurma);
		
		for(double[] notasDosAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDosAluno));
		}

		scanner.close();
	}
}
