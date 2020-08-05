package projetopessoas;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	//metodos
	
	public void cancelarMatricula() {
		System.out.println("matricula sera cancelada");
	}

	// get e set
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
