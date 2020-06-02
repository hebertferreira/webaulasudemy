package section09;

import java.util.Scanner;

import entidades.Quarto32;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Quarto32[] novoQuarto = new Quarto32[10];
		
		System.out.print("Informe quantos deseja ocupar: ");
		int reserva = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < reserva; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do estudande: ");
			String nome = sc.nextLine();
			System.out.print("Digite o email do estudande: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto do estudande: ");
			int quarto = sc.nextInt();
			System.out.println();
			
			novoQuarto[quarto] = new Quarto32(nome, email);
			System.out.println("==============================================");
		}
		System.out.println("QUARTOS OCUPADOS:");
		
		for(int i = 0; i < novoQuarto.length; i++) {
			if(novoQuarto[i] !=null) {
				System.out.println(i + ":"+novoQuarto[i]);
			}
		}
		sc.close();
	}

}
