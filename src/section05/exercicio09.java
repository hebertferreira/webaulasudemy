package section05;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int produto01, produto02;
		double valor01 = 0.00;
		double valor02 = 0.00;
		
		System.out.println("Abaixo segue o cardapio");
		System.out.println("1 - Cachorro Quente  R$  4,00");
		System.out.println("2 - X-Salada         R$  4,50");
		System.out.println("3 - X-Bacon          R$  5,00");
		System.out.println("4 - Torrada Simples  R$  2,00");
		System.out.println("5 - Refrigerante     R$  1,50");
		System.out.println(" ");
		System.out.println("Digite a primeira opção do lanche:");
		
		produto01 = sc.nextInt();
		
		if(produto01 == 1) {
			valor01 = 4.00;
		}else if(produto01 == 2) {
			valor01 = 4.50;
		}else if(produto01 == 3) {
			valor01 = 5.00;
		}else if(produto01 == 4) {
			valor01 = 2.00;
		}else if(produto01 == 5) {
			valor01 = 1.50;
		}else {
			System.out.println("Erro! Pedido Cancelado!");
		}
		System.out.println(" ");
		System.out.println("Agora Digite da segunda opção:");
		
		produto02 = sc.nextInt();
		
		if(produto02 == 1) {
			valor02 = 4.00;
		}else if(produto02 == 2) {
			valor02 = 4.50;
		}else if(produto02 == 3) {
			valor02 = 5.00;
		}else if(produto02 == 4) {
			valor02 = 2.00;
		}else if(produto02 == 5) {
			valor02 = 1.50;
		}else {
			System.out.println("Erro! Pedido Cancelado!");
		}
		
		System.out.printf("O valor total do seu pedido é de R$ %.2f%n", valor01+valor02);
		sc.close();
	}

}
