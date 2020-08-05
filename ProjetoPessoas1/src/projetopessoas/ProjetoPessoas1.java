package projetopessoas;

public class ProjetoPessoas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		//
		p1.setNome("jaco");
		p2.setNome("maria");
		p3.setNome("claudio");
		p4.setNome("marta");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
