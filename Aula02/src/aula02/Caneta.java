package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status () {
		System.out.println("Uma caneta "+this.cor+
							" do modelo "+this.modelo+
							" da ponta de "+this.ponta+
							" com "+this.carga+ " de carga ");
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro");
		}else {
			System.out.println("Rabisco");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
}
