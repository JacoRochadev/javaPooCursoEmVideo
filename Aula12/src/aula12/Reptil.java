package aula12;

public class Reptil extends Animal {
	private String cordaescama;
	
	public String getCordaescama() {
		return cordaescama;
	}
	public void setCordaescama(String ce) {
		this.cordaescama = ce;
	}
	@Override
	public void locomover() {
		System.out.println("rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comndo vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
		
	}

}
