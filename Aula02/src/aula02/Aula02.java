package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.ponta = 3.5f;
		c1.carga = 80;
		c1.tampada = true;
		c1.status();
		c1.destampar();
		c1.rabiscar();
		

	}

}
