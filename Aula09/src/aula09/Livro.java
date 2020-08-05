package aula09;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//
	
	
	public String detalhes() {
		return "Livro [\ntitulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + 
				"\n, pagAtual=" + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n]";
	}
	
	//construtor
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa p) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.setAberto(false);
		this.setPagAtual(0);
		this.leitor = p;
	}
	
	//get e set

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//interface
	
	@Override
	public void abrir() {
		this.setAberto(true);
		this.setPagAtual(0);
	}
	@Override
	public void fechar() {
		this.setAberto(false);
		
	}
	@Override
	public void folhear(int p) {
		if(p > this.getTotPaginas()) {
			this.pagAtual = 0;
		}else {
			this.setPagAtual(p);
			}
		
	}
	@Override
	public void avancarPag() {
		if(this.isAberto()) {
			this.setPagAtual(this.getPagAtual() + 1);
		}else {
			System.out.println("Livro fechado");
		}
		
	}
	@Override
	public void voltarPag() {
		if(this.isAberto()) {
			this.setPagAtual(this.getPagAtual() - 1);
		}else {
			System.out.println("Livro fechado");
		}
		
	}
}
