package section06;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num, numFatorial;
		
		System.out.print("Digite o valor fatorial a ser calculado:");
		numFatorial = sc.nextInt();
		num = 1;

		if(numFatorial == 0) {
			
			System.out.println("O valor fatorial de zero = 1");
			
		}else {
		
		for(int i = 1; i <= numFatorial; i++) {
				
				num = num * i;
				
			}
			System.out.printf("O valor de %d! = %d", numFatorial, num);
		}
		sc.close();
	}
	
}
