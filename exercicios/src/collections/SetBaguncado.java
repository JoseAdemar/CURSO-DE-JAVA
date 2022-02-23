package collections;

import java.util.HashSet;
import java.util.Set;

public class SetBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" }) // Evita os warings no código
	public static void main(String[] args) {
    	 
		HashSet conjunto1 = new HashSet();
    	 
		// Adicionando elementos ao conjunto
    	 conjunto1.add(1.2);
    	 conjunto1.add(true);
    	 conjunto1.add("Teste");
    	 conjunto1.add(1);
    	 conjunto1.add('x');
    	 
    	 System.out.println("Tamanho do conjunto é: " + conjunto1.size());
    	 
    	 conjunto1.add("teste");
    	 System.out.println("Tamanho do conjunto é: " + conjunto1.size());
    	 
    	 // Removendo elementos do conjunto
    	 
    	 System.out.println(conjunto1.remove("teste"));
    	 System.out.println(conjunto1.remove('x'));
    	 System.out.println("Tamanho do conjunto é: " + conjunto1.size());
    	 
    	 System.out.println(conjunto1.contains('x'));
    	 
    	 
    	 // Utilizando a interface Set
    	 Set conjunto2 = new HashSet();
    	 
    	 conjunto2.add(1);
    	 conjunto2.add(2);
    	 conjunto2.add(3);
    	 conjunto2.add(4);
    	 System.out.println(conjunto2);
    	 
    	 // União dos conjuntos une o conjunto um com o conjunto dois.
    	 conjunto1.addAll(conjunto2);
    	 System.out.println(conjunto1);
    	 
    	 
    	 // Retem o conjunto dois do conjunto um
    	 conjunto1.retainAll(conjunto2);
    	 System.out.println(conjunto1);
    	 
    	 
    	// Limpa o conjunto
    	 conjunto1.clear();
    	 System.out.println(conjunto1);
	}

}
