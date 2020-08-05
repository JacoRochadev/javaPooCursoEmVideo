package aula12;

public class Mamifero extends Animal {
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String cp) {
		this.corPelo = cp;
	}
	@Override
	public void locomover() {
		System.out.println("correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
	}

}
