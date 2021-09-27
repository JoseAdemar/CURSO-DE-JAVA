package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Informe um número: ");
		 double num1 = sc.nextDouble();
		 
		 System.out.println("Informe um número: ");
		 double num2 = sc.nextDouble();
		 
		 System.out.println("Informe a operação: ");
		 String operacao = sc.next();
		 
		 double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		 resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		 resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		 resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		 resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		 
		 System.out.printf("%.2f  %s %.2f = %.2f",
				 num1,operacao,num2, resultado);
		 
		 sc.close();
		 
		 
	}
}
