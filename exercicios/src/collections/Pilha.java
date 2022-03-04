package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
       
		 Deque<String> livros = new ArrayDeque<>();
		 
		 livros.add("O pequeno príncipe");
		 livros.push("Don quixote");
		 livros.push("O hobit");
		 
		 // O ultimo a entrar é o primeiro a sair
		 // Formas de adicionar elementos
		 System.out.println(livros.peek());
		 System.out.println(livros.element());
		 
		 
		 // Formas de remover elementos 
		 System.out.println(livros.poll()); 
		 System.out.println(livros.poll());
		 System.out.println(livros.pop());
		 System.out.println(livros.remove());
		 
	}
}
