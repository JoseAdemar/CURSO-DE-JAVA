package OrientacaoAObjetos;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Junior");
		Aluno aluno2 = new Aluno("José");
		Aluno aluno3 = new Aluno("Maria");

		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Angular");
		Curso curso3 = new Curso("Java Script");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Meu nome é: " + aluno.nome);
			System.out.println("Estou matriculado no " + aluno.cursos);
			
		}

	}

}
