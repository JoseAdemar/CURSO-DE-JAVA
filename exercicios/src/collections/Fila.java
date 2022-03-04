package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	 public static void main(String[] args) {
		
		 Queue<String> fila = new LinkedList<>();
		 
		 // Tanto Offer quanto Add adiciona elementos na fila
		 // A diferen�a � o comportamento quando a fila est� cheia
		 // Add retorna uma exce��o e Offer retorna false
		 
		 fila.add("Ana");
		 fila.offer("Bia");
		 fila.add("Carlos");
		 fila.offer("Daniel");
		 fila.add("Rafaela");
		 fila.offer("Gui");
		 
		 System.out.println(fila.peek()); // Quando n�o tem elemento retorna null / retorna o elemento m�s n�o remove
		 System.out.println(fila.element()); // Quando n�o tem elemento retorna uma exe��o / retorna o elemento m�s n�o remove
		 
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Remove elementos da fila
		 System.out.println(fila.poll()); // Retorna null devido ter removido todos os elementos da fila
		 
		 // Tamb�m pode ser utilizado o remove por�m quando n�o existir mais elementos vai ser lan�ada uma exe��o
		 System.out.println(fila.remove());
	}
}
