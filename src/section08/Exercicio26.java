package section08;

import java.util.Scanner;
import entidades.Triangulos;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulos x, y;
		x = new Triangulos();
		y = new Triangulos();
		
		double area;
		
		System.out.println("Digite os valores para calular a area do triangulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		area = x.calcularArea();
		
		System.out.printf("A area do triangulo X é %.4f\n\n",area); 
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		area = y.calcularArea();
		
		System.out.printf("A area do triangulo X é %.4f\n\n",area); 
		
		sc.close();

	}

}
