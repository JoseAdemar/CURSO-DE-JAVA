package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetComportado {

	public static void main(String[] args) {
        
		// Utilizando o Set com HashSet ele não mantem a ordem que foi inserido os dados.
		// Set<String> listaAprovado = new HashSet<>();
		// Utilizando o Set com o TreeSet ele mantem a ordem dos dados.
		Set<String> listaAprovado = new TreeSet<>() ;

		listaAprovado.add("Ana");
		listaAprovado.add("Carlos");
		listaAprovado.add("Lucas");
		listaAprovado.add("Pedro");

		for (String candidado : listaAprovado)
			System.out.println(candidado);

	}
}
