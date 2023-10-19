package Atividade02;


public class Main {
	
	public static void main(String[] args) {
	Produto produto = new Produto("Super-Nintendo", 1800,3);
	System.out.println("Produtos: ");
	System.out.println("Nome: " + produto.getNome());
	System.out.println("Preço: " + produto.getPreco());
	System.out.println("Id: " + produto.getId());
	System.out.println("------------------------");
	
	Camisa camisa = new Camisa("Barcelona",259,1,"azul","dri-fit","M");
	System.out.println("Camisa: " + camisa.getNome());
	System.out.println("Preço: " + camisa.getPreco());
	System.out.println("Id: " + camisa.getId());
	System.out.println("Cor: " + camisa.getCor());
	System.out.println("Tecido: " + camisa.getTecido());
	System.out.println("Tamanho: " + camisa.getTamanho());
	System.out.println("------------------------");
	
	Sorvete sorvete = new Sorvete("Baunilha",07.00,1,"30 graus");
	System.out.println("Sorvete: ");
	System.out.println("Nome: " + sorvete.getNome());
	System.out.println("Preço: " + sorvete.getPreco());
	System.out.println("Id: " + sorvete.getId());
	System.out.println("Temp: " + sorvete.getTempAdequada());

	System.out.println("------------------------");
	
}
}