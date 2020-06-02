package section08;

import java.util.Scanner;

import entidades.Retangulo;

public class Exercicio27A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo  novoRetangulo = new Retangulo();
		
		System.out.print("Digite o valor da largura:");
		novoRetangulo.largura =  sc.nextDouble();
		System.out.println("");
		System.out.print("Digite o valor da altura: ");
		novoRetangulo.altura =  sc.nextDouble();
		System.out.println("");
		
		System.out.println(novoRetangulo);
		
		
		sc.close();
	}

}
