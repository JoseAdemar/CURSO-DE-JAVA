package classes;

import java.util.Date;

public class EqualsHascode {
	public static void main(String[] args) {

		UsuarioEqualsHascode usuario1 = new UsuarioEqualsHascode();
		usuario1.nome = "Pedro Silva";
		usuario1.email = "pedro.silva@email.com";

		UsuarioEqualsHascode usuario2 = new UsuarioEqualsHascode();
		usuario2.nome = "Pedro Silva";
		usuario2.email = "pedro.silva@email.com";
		
		System.out.println(usuario1 == usuario2); // false
		System.out.println(usuario1.equals(usuario2)); // true
		System.out.println(usuario2.equals(new Date())); // false

	}
}
