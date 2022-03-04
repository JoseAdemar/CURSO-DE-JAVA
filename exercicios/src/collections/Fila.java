package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	 public static void main(String[] args) {
		
		 Queue<String> fila = new LinkedList<>();
		 
		 // Tanto Offer quanto Add adiciona elementos na fila
		 // A diferença é o comportamento quando a fila está cheia
		 // Add retorna uma exceção e Offer retorna false
		 
		 fila.add("Ana");
		 fila.offer("Bia");
		 fila.add("Carlos");
		 fila.offer("Daniel");
		 fila.add("Rafaela");
		 fila.offer("Gui");
		 
		 System.out.println(fila.peek()); // Quando não tem elemento retorna null / retorna o elemento más não remove
		 System.out.println(fila.element()); // Quando não tem elemento retorna uma exeção / retorna o elemento más não remove
		 
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Retorna null devido ter removido todos os elementos da fila
		 
		 // Também pode ser utilizado o remove porém quando não existir mais elementos vai ser lançada uma exeção
		 System.out.println(fila.remove());
	}
}
