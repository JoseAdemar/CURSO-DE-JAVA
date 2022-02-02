package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		Double[] notasAlunoA = new Double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		System.out.println("#############################");

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		System.out.println(Arrays.toString(notasAlunoA));

		System.out.println();
		System.out.println("######################");

		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.print("  " + notasAlunoA[i]);
		}

		System.out.println();
		System.out.println("######################");

		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {

			total += notasAlunoA[i];

		}

		System.out.println(total / notasAlunoA.length);
	
		System.out.println("######################");

	    double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
	
	    double totalAlunoB = 0;
	    for(int i = 0; i < notasAlunoB.length; i++) {
	    totalAlunoB += notasAlunoB[i];
	}
	    
	    System.out.println(totalAlunoB / notasAlunoB.length);
  }  
}




