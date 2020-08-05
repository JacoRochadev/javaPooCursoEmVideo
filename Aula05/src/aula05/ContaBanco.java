package aula05;

public class ContaBanco {
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	public void estado() {
		System.out.println("numero da conta: "+this.getNumconta());
		System.out.println("tipo: "+this.getTipo());
		System.out.println("dono: "+this.getDono());
		System.out.println("saldo: "+this.getSaldo());
		System.out.println("status: "+this.isStatus());
	}
	
	//metodo construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	//metodos 
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		}else if(tipo =="CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta!!");
	}
	public void fecharConta() {
		if (this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Conta fechada!!");
		}else if(this.getSaldo() < 0) {
			System.out.println("Erro, Conta em debito");
		}else {
			System.out.println("Erro, voce tem dinheiro na conta");
		}
		
	}
	public void depositar(float valor) {
		if (this.status == true) {
		this.setSaldo(this.getSaldo() + valor);
		}else {
			System.out.println("sem conta criada");
		}
	}
	public void sacar(float valor) {
		if(this.status == true && this.getSaldo() > 0) {
			this.setSaldo(this.getSaldo() - valor);
		}else {
			System.out.println("impossivel sacar");
		}
	}
	public void pagarMensal() {
		int v;
		if(this.getTipo() == "CC") {
			v =12;
		}else {
			v = 20;
		}
		if(status == true && this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
		}else {
			System.out.println("impossivel pagar");
		}
	}
	//metodos getters e setters
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
