package section09;

import java.util.Scanner;
import entidades.Produto29;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto");
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Preço do produto:");
		double preco = sc.nextDouble();
		System.out.print("Quantidade do produto:");
		int qtde = sc.nextInt();
		
		Produto29 novoProduto = new Produto29(nome, preco, qtde);
		
		System.out.println("Produto29: " + novoProduto.nome + ",Preço: " + novoProduto.preco + ", Qtde Estoque: " + novoProduto.qtde);
		System.out.println(novoProduto);
		System.out.println();

		System.out.print("Entre com a quantidade que gostaria de adicionar ao estoque: ");
		
		qtde = sc.nextInt();
		
		novoProduto.adicionadoProdutoEstoque(qtde);
		
		System.out.print(novoProduto);
		System.out.println("\n");

		System.out.print("Entre com a quantidade que gostaria de remover do estoque: ");
		
		qtde = sc.nextInt();
		
		novoProduto.removendoProdutoEstoque(qtde);
		
		System.out.print(novoProduto);
		System.out.println();

		
		sc.close();
	}

}
