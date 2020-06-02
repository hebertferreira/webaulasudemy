package section09;

import java.util.Scanner;

import entidades.Produto30;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto");
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Preço do produto:");
		double preco = sc.nextDouble();
		
		Produto30 novoProduto = new Produto30(nome, preco);
		System.out.println();
		System.out.println("Produto30: " + novoProduto.getNome() + ",Preço: " + novoProduto.getPreco() + ", Qtde Estoque: " + novoProduto.getQtde());
		System.out.println();
		System.out.println(novoProduto);
		System.out.println();

		System.out.print("Entre com a quantidade que gostaria de adicionar ao estoque: ");
		int qtde = sc.nextInt();
		novoProduto.adicionarProdutoEstoque(qtde);
		System.out.println();
		System.out.print(novoProduto);
		System.out.println("\n");

		System.out.print("Entre com a quantidade que gostaria de remover do estoque: ");		
		qtde = sc.nextInt();
		novoProduto.removerProdutoEstoque(qtde);
		System.out.println();
		System.out.print(novoProduto);
		System.out.println();

		
		sc.close();
	}
}
