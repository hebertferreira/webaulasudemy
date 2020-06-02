package section05;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite o primeiro numero:");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo numero:");
		y = sc.nextInt();


		
		if(x % y == 0 || y % x == 0) {
			System.out.println(x + " e " + y + " MULTIPLOS");
		}else {
			System.out.println(x + " e " + y + " NÃO SÃO MULTIPLOS");
		}
		
		System.out.println("Digite novamente o primeiro numero:");
		x = sc.nextInt();
		
		System.out.println("Digite novamente o segundo numero:");
		y = sc.nextInt();

		
		if(x % y == 0 || y % x == 0) {
			System.out.println(x + " e " + y + " MULTIPLOS");
		}else {
			System.out.println(x + " e " + y + " NÃO SÃO MULTIPLOS");
		}
		
		
		System.out.println("Digite pela ultima vez o primeiro numero:");
		x = sc.nextInt();
		
		System.out.println("Digite pela ultima vez o segundo numero:");
		y = sc.nextInt();

		
		if(x % y == 0 || y % x == 0) {
			System.out.println(x + " e " + y + " MULTIPLOS");
		}else {
			System.out.println(x + " e " + y + " NÃO SÃO MULTIPLOS");
		}
		
		sc.close();

	}

}
