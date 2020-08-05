package aula06;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	//metodos getters e setters
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//metodos abstratos
	
	
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public void abrirMenu() {
		System.out.println("Esta ligado: "+this.getLigado());
		System.out.println("Esta tocando: "+this.getTocando());
		System.out.println("Volume: "+this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print(" | ");
		}
	}
	
	public void fecharMenu() {;
		System.out.println("fechando menu...");
		
	}
	
	public void maisVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() + 10);
		}
	}
	
	public void menosVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() - 10);
		}
	}
	
	public void ligarMudo() {
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	
	public void desligarMudo() {
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}
	
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}
	
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	
	
}