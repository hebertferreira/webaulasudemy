package section05;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.print("Informe o valor de X: ");
		x = sc.nextDouble();
		
		System.out.print("Informe o valor de Y: ");
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Vetor aponta em Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Vetor aponta em Q2 ");
		}else if(x < 0 && y < 0) {
			System.out.println("Vetor aponta em Q3 ");
		}else if(x > 0 && y < 0) {
			System.out.println("Vetor aponta em Q4 ");
		}else {
			System.out.println("Vetor é ZERO ");
		}
		sc.close();
	}

}
