package entidades;

public class Produto29 {
	
	public String nome;
	public double preco;
	public int qtde;
	
	//Contrutor #1
	
	public Produto29() {
		
	}
	
	//Contrutor #2
	public Produto29(String nome, double preco, int qtde) {
		
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
		
	}
	
	public double valorTotalEstoque() {
		
		return preco * qtde;
	}
	
	public void adicionadoProdutoEstoque(int qtde) {
		
		this.qtde = this.qtde + qtde;
		
	}
	
	public void removendoProdutoEstoque(int qtde) {
		
		this.qtde = this.qtde - qtde;
	}
	
	public String toString() {
		
		return nome + ", R$" + String.format("%.2f", preco) + ", " + qtde + " unidades, Total R$" + String.format("%.2f", valorTotalEstoque());
	}

}
