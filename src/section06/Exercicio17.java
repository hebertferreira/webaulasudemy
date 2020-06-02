package section06;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Quantos numeros voce vai digitar?");
		num = sc.nextInt();
		int x = 0;
		int soma = 0;
		
		for(int i = 1; i  <= num ; i++) {
			
			System.out.printf("Digite o %dº numero. ", i);
			x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("A soma de todos os valores digitados é " + soma);
		sc.close();
	}

}
