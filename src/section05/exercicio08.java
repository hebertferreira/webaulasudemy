package section05;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim;
		
		System.out.println("Que horas começou o jogo?");
		horaInicio = sc.nextInt();
		System.out.println("Que horas acabou o jogo?");
		horaFim = sc.nextInt();
		
		if(horaInicio <= horaFim) {
			System.out.printf("O jogo durou exatamente %d", horaFim - horaInicio);
		}else {
			System.out.printf("O jogo durou exatamente %d", (horaFim + 24) - horaInicio);

		}
		sc.close();

	}

}
