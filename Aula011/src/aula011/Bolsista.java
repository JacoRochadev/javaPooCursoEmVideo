package aula011;

public class Bolsista extends Aluno {
	private float bolsa;
	
	//
	
	public void renovarBolsa() {
		System.out.println("renovando bolsa");
	}
	
	public void pagarMensalidade() {
		System.out.println("pagamento facilitado");
	}
	
	//get e set
	
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
