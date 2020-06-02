package entidades;

public class Produto30 {
	
	private String nome;
	private double preco;
	private int qtde;
	
	public Produto30(String nome, double preco, int qtde) {
		
		this.nome = nome;
		this.preco= preco;
		this.qtde = qtde;	
	}
	
	public Produto30(String nome, double preco) {
		
		this.nome = nome;
		this.preco= preco;	
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
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public double valorTotalEstoque() {
		return qtde * preco;
	}
	
	public void adicionarProdutoEstoque(int qtde) {
		
		this.qtde = this.qtde + qtde;
	}
	
	public void removerProdutoEstoque(int qtde) {
		
		this.qtde = this.qtde - qtde;
	}
	
	public String toString() {
		
		return "Produto: " + getNome() + ", valor de R$ " + String.format("%.2f", getPreco()) + ".Quantidade atual em estoque: " + getQtde() +
				".\nEstoque avaliado em R$ " + String.format("%.2f", valorTotalEstoque())  ;
	}

}
