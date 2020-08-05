package aula011;

public class Aula011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante();
		v1.setNome("luan");
		Aluno a1 = new Aluno();
		a1.setNome("jao");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.pagarMensalidade();
		Professor p1 = new Professor();
		p1.receberAumento(111f);
		System.out.println(p1.toString());
	}

}
