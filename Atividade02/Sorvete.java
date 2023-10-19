package Atividade02;

public class Sorvete extends Produto {
	private String tempAdequada;

	public Sorvete(String nome, double preco, long id, String tempAdequada) {
		super(nome, preco, id);
		this.tempAdequada = tempAdequada;
	}

	public String getTempAdequada() {
		return tempAdequada;
	}

	public void setTempAdequada(String tempAdequada) {
		this.tempAdequada = tempAdequada;
	}

}
