package aula12;

public class Peixe extends Animal {
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String ce) {
		this.corEscama = ce;
	}
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("nadando");
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("comer substancias");
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("emitindo ondas");
	}
	public void soltarBolhas() {
		System.out.println("soltando bolhas");
	}
	
}
