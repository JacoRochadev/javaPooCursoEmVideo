package aula12;

public class Ave extends Animal{
	private String corPena;
	
	
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	public void fazerNinho() {
		System.out.println("CONSTRUINDO NINHO");
	}
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("bicar");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("assobiar");
	}
}
