package classes;

public class UsuarioEqualsHascode {
	String nome;
	String email;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof UsuarioEqualsHascode) {
			UsuarioEqualsHascode usuario = (UsuarioEqualsHascode) obj; // Converti o objeto usuario para obj

			boolean nomeIgual = usuario.nome.equals(this.nome);
			boolean emailIgual = usuario.email.equals(this.email);

			return nomeIgual && emailIgual;

		} else {
			return false;
		}
	}
}
