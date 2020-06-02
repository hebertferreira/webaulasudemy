package section09;

import java.util.Scanner;

import entidades.ContaBancaria31;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do novo titular: ");
		String titular = sc.nextLine();
		System.out.print("Agora informe o numero da nova conta: ");
		String numeroConta = sc.nextLine();
		System.out.println();
		
		ContaBancaria31 contaBancaria31 = new ContaBancaria31(titular, numeroConta);
		
		System.out.println(contaBancaria31);
		
		System.out.print("Informe quanto vai depositar hoje: ");
		double valor = sc.nextDouble();
		System.out.println();
		contaBancaria31.depositarMoney(valor);
		System.out.println(contaBancaria31);
		
		System.out.println("Informe quanto deseja retirar: ");
		valor = sc.nextDouble();
		contaBancaria31.retirarMoney(valor);
		System.out.println(contaBancaria31);
		System.out.println("OPERACOES ENCERRADAS");
	
		sc.close();
	}
	
}
