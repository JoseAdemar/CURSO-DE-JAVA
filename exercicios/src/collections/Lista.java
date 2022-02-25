package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
  public static void main(String[] args) {
	
	   List<Usuario> lista = new ArrayList<>();
	   
	   Usuario usuario1 = new Usuario("Ana");
	   lista.add(usuario1);
	   lista.add(new Usuario("Carlos"));
	   lista.add(new Usuario("Lia"));
	   lista.add(new Usuario("Bia"));
	   lista.add(new Usuario("Manu"));
	   
	   System.out.println(lista.get(3));
	   System.out.println("###############################");
	   
	   // Removendo elementos da lista.
	   lista.remove(1);
	   lista.remove(new Usuario("Manu"));
	   
	   for(Usuario listaUsuario : lista) {
		   System.out.println(listaUsuario);
	   }
}
}
