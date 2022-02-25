package collections;

import java.util.Objects;

public class Usuario {
	String usuario;

	// Construtor
	public Usuario(String usuario) {
		this.usuario = usuario;
	}

	// Abaixo equals e hashcode
	@Override
	public int hashCode() {
		return Objects.hash(usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Meu nome é: " + usuario ;
	}
	
	

}
