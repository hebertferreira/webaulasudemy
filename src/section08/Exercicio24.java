package section08;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// Calcular a area de um triangulo S/METODOS

		Scanner sc = new Scanner(System.in);
		
		double xA,xB,xC, yA,yB,yC, p, area;
		
		System.out.println("Digite os valores do tringulo X para calcularmos a área:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		

		
		p = (xA + xB + xC) /2; 
		
		area = Math.sqrt(p*(p-xA) * (p - xB) * (p - xC));
		
		System.out.println("A area de triangulo X é " + area);
		

		System.out.println("Digite os valores do tringulo Y para calcularmos a área:");		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (yA + yB + yC) /2; 
		
		area = Math.sqrt(p*(p-yA) * (p - yB) * (p - yC));
		
		System.out.println("A area de triangulo Y é " + area);

		sc.close();
	}

}
