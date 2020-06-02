package section08;

import java.util.Scanner;
import entidades.Triangulos;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangulos x, y;
		x= new Triangulos();
		y= new Triangulos();
		
		double p, area;
		
		System.out.println("Digite os valores do triangulo X para calcularmos a area: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		p = (x.a + x.b + x.c)/2;
		area = Math.sqrt(p*(p - x.a)*(p - x.b)*(p - x.c));
		
		System.out.printf("A area do triangulo X é %.4f\n\n", area);
		
		System.out.println("Digite os valores do triangulo Y para calcularmos a area: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (y.a + y.b + y.c)/2;
		area = Math.sqrt(p*(p - y.a)*(p - y.b)*(p - y.c));
		
		System.out.printf("A area do triangulo X é %.4f", area);
		
		sc.close();
	}

}
