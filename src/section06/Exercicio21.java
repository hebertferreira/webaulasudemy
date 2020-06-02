package section06;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite quantos testes irá fazer: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int x, y, z;
			System.out.print("Digite o primeiro numero: ");
			x = sc.nextInt();
			
			System.out.print("Digite o segundo numero: ");
			y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("divisao impossivel");
			}else {
				z = x/y;
				System.out.println("O resultado da divisão é " + z);
			}
		}
		sc.close();
	}
}
