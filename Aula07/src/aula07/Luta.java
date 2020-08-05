package aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//getter e setter
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if (this.isAprovada()) {
			
			System.out.println("desafiado");
			this.getDesafiado().apresentar();
			System.out.println("desafiante");
			this.getDesafiante().apresentar();
			
			Random ale = new Random();
			int vencedor = ale.nextInt(3);//0 1 2
			switch(vencedor){
			case 0://empate
				System.out.println("empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1://desafiado vence 
				System.out.println("desafiado venceu");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2://desafiante vence
				System.out.println("desafiante venceu");
				this.desafiado.perderLuta();
				this.desafiado.ganharLuta();
			}
		}else {
			System.out.println("a luta n foi aprovada");
		}
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	



}