package section06;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		double soma = 0.00;
		
		System.out.print("Deseja fazer a média de quantos numeros: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("Digite um numero: ");
			double x = sc.nextDouble();
			soma = soma+x;
		}
		System.out.printf("A media ponderada dos %d numeros é de %.1f ! ", num, soma/num );
		sc.close();
	}

}
