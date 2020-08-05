package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status () {
		System.out.println("Uma caneta "+this.cor+
							" do modelo "+this.modelo+
							" da ponta de "+this.ponta+
							" com "+this.carga+ " de carga ");
	}
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro");
		}else {
			System.out.println("Rabisco");
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
}
