package section06;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros e para parar e somar digite ZERO:");
		
		int num = sc.nextInt();
		int soma = 0;
		System.out.println("Numero digitado foi " + num);

		
		while(num != 0) {
			
			soma += num;
			System.out.println("Digite o proximo numero ou ZERO para finalizar:");
			num = sc.nextInt();
			System.out.println("Numero digitado foi " + num);
			
		}
		
		System.out.println("A soma de todos os numeros digitados = " + soma);

		System.out.println("Obrigado por usar nosso programa!");

		sc.close();
	}

}
