package section06;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo;
		
		System.out.printf("OPÇOES:%n1 - Alcool%n2 - Gasolina%n3 - Diesel%n0 - FIM%n");
		System.out.print("Digite a opção que deseja: ");
		codigo = sc.nextInt();
		System.out.print("");
		
		while(codigo != 0) {
			
			if(codigo == 1) {
				System.out.println("Alcool");
			}else if(codigo == 2) {
				System.out.println("Gasolina");
			}else if(codigo == 3) {
				System.out.println("Diesel");
			}else{
				System.out.println("ERROR! Try again!");
			}
			
			System.out.print("Digite a opção que deseja: ");
			codigo = sc.nextInt();
		}
		sc.close();
		
		System.out.println("FIM");
	}

}
