package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();

	// Construtor
	public Curso(String nome) {
		this.nome = nome;
	}
	
	// Metodo adicionar aluno
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	public String toString() {
		return " Curso: " + nome;
	}
}
