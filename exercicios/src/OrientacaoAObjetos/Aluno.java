package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();

	// Construtor
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	// Metodo adicionar aluno
	public void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return " Curso: " + nome;
	}
}
