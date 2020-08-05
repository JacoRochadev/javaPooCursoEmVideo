package aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//metodo construtor
	public Lutador(String nome, 
						String nacionalidade,
						int idade,
						float altura,
						float peso,
						int vitorias,
						int derrotas,
						int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	//metodos 
	
	public void apresentar() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Nacionalidade: "+this.getNacionalidade());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Peso: "+this.getPeso());
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Vitorias: "+this.getVitorias());
		System.out.println("Derrotas: "+this.getDerrotas());
		System.out.println("Empates: "+this.getEmpates());
	}
	public void status() {
		System.out.println("O Lutador "+this.getNome());
		System.out.println("Na categoria "+this.getCategoria());
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	//metodos getter e setter
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if(this.getPeso() < 50.2) {
			this.categoria = "invalido";
		}else if(this.getPeso() <= 70.3) {
			this.categoria = "Leve.";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "medio";
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "peso pesado";
		}else {
			this.categoria = "invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
