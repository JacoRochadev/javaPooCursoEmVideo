package aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco c1 = new ContaBanco();
		c1.abrirConta("CC");
		c1.depositar(300);
		c1.sacar(350);
		c1.fecharConta();
		c1.estado();
	}

}
