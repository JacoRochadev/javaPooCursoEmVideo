package aula09;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	//
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//
	
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}

	//set e get
	
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sx) {
		this.sexo = sx;
	}
}
