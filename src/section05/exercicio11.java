package section05;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int planoBasico = 100;
		double valorPlanoBasico = 50.00;
		int tempoFalado = 0;
		double valorParaPagar = 0.00;
		double adicionalPorMinuto = 2.00;
		
		
		System.out.println("Quantos minutos você falou esse mes:");
		
		tempoFalado = sc.nextInt();
		
		if(tempoFalado <= 100) {
			System.out.printf("Voce pagará R$ %.2f%n", valorPlanoBasico);
		}else {
			
			double x = 0.00;
			x = (tempoFalado - planoBasico) * adicionalPorMinuto; 
			valorParaPagar = valorPlanoBasico + x;
			
			System.out.printf("Voce pagará no total R$ %.2f!%n", valorParaPagar);
		}
		sc.close();	
	}

}
