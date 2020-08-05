package aula011;

public class Tecnico extends Aluno {
	private String registroProfissional;
	
	//
	
	public void praticar() {
		System.out.println("praticando");
	}
	
	//get e set

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	
}
