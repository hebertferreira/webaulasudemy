package section06;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		System.out.println("Os numero impares são: ");
		
		for(int i =0; i < num; i++) {
			
			if(i%2 ==1) {
				System.out.print(i + " é primo, ");
			}else {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
