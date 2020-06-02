package section05;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}else if(hora < 18) {
			if(hora <16){
				System.out.println("Taaarde! Ainda estou pesado do almoço!");
			}else {
				System.out.println("Hora do chá!");
			}
		}else if(hora <= 24) {
			System.out.println("Noite sô!");
		}else {
			System.out.println("Coloque um numero valido!");
		}
		
		sc.close();

	}

}
