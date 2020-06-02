package section05;

import java.util.Scanner;

public class exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Digite o primeiro valor: ");
		x= sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		y= sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		z= sc.nextInt();
		
		if(x < 0) {
			System.out.println(x+" Negativo!!");
		}else {
			System.out.println(x+" Positivo!!");
		}
		
		if(y < 0) {
			System.out.println(y+" Negativo!!");
		}else {
			System.out.println(y+" Positivo!!");
		}
		
		if(z < 0) {
			System.out.println(z+" Negativo!!");
		}else {
			System.out.println(z+" Positivo!!");
		}
		
		sc.close();
	}

}
