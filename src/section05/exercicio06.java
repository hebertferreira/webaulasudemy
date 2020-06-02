package section05;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Digite o primeiro numero:");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo numero:");
		y = sc.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		z = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		if(y % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		if(z % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
