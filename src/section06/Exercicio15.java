package section06;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite a coordenada X e logo a seguir a Y.");
		
		System.out.print("Digite a coordenada X: ");
		x = sc.nextInt();
		
		System.out.print("Digite agora a coordenada Y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x < 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			}else if(x > 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}else {
				System.out.println("Quarto32 Quadrante");
			}
			
			
			System.out.println("Digite novamente as coordenadas X e Y.");
			System.out.print("Digite a coordenada X: ");
			x = sc.nextInt();
			
			System.out.print("Digite agora a coordenada Y: ");
			y = sc.nextInt();
			System.out.println("");
		}
		
		System.out.println("Umas das coordenadas é ZERO. Programa finalizado!");
		
		sc.close();
	}

}
