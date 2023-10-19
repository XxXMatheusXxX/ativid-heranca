package Atividade02;

public class Produto {
	private String nome;
	private double preco;
	private long id;

	public Produto(String nome, double preco, long id) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
