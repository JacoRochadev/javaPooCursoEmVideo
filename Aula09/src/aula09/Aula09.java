package aula09;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		p[0] = new Pessoa("jaco", 18 , "masc");
		l[0] = new Livro("o pequeno principe", "macedo", 150, p[0]);
		l[0].folhear(9000);
		System.out.println(l[0].detalhes());
		
	}

}
