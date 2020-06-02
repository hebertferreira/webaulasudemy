package section06;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o numero que deseja: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i  == 0) {
				System.out.printf("%d / %d =  %d%n", num, i, num / i );
			}else {
				System.out.println("");
			}
		}
		sc.close();
	}

}
