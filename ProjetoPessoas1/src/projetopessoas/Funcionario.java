package projetopessoas;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	//metodos
	
	public void mudarTrabalho() {
		if(this.isTrabalhando()) {
			this.setTrabalhando(false);
		}else {
			this.setTrabalhando(true);
		}
	}
	
	//get e set

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
