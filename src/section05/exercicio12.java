package section05;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int diaSemana;
		
		System.out.println("Qual dia da semana é hoje?");
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Terça");
			break;
			
		case 4:
			System.out.println("Quarta");
			break;	
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("Sabado");
			break;
			
		default:
			System.out.println("Escolha um dia valido");
			break;
		}
		
		sc.close();
	}

}
