package aula011;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	
	
	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}

	public void receberAumento(float v) {
		this.setSalario(this.getSalario() + v);
	}
	
	//get e set
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
