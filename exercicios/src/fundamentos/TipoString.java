package fundamentos;

import java.util.Locale;

public class TipoString {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		s = s.toUpperCase();

		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		System.out.println("###################################\n");
		
         var nome = "Pedro";
         var sobrenome = "Santos";
         var idade = 33;
         var salario = 12345.987;
         
         System.out.println("Nome=" + nome 
        		 + " \nSobrenome= " + sobrenome 
        		 + " \nIdade= " + idade 
        		 + " \nSalário= " + salario );
         
         System.out.println("#######################################\n");
         
         System.out.printf("O senhor %s %s de %d anos ganha um salário de R$%.2f reais \n",
        		       nome, sobrenome, idade, salario );
         
         System.out.println("#######################################");
         
         String frase = String.format("\nO senhor %s %s de %d anos ganha um salário de R$%.2f reais ",
        		       nome, sobrenome, idade, salario );
         System.out.println(frase);
         
	}
}
