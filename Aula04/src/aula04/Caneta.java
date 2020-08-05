package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public boolean isTampada() {
		return tampada;
	}


	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}


	public Caneta(String modelo, float ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public float getPonta() {
		return ponta;
	}


	public void setPonta(float ponta) {
		this.ponta = ponta;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	
	
	
	public void status(){
		System.out.println("Sobre a caneta");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.cor);
		System.out.println("Tampada? "+this.tampada);
	}
}
