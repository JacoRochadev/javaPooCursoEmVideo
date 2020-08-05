package aula07;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[6];
				
		l[0] = new Lutador("jaco", "brasil", 18,1.70f,70f,5,0,1);
		l[1] = new Lutador("joao", "brasil", 18,1.70f,70f,5,0,1);
		
		Luta uec01 = new Luta();
		uec01.marcarLuta(l[0], l[1]);
		uec01.lutar();
	}

}
