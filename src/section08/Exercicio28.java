package section08;

import java.util.Scanner;

import util.ConversorMoeda;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar hoje? ");
		double valor = sc.nextDouble();
		System.out.println();
		System.out.print("Quando deseja trocar? ");
		double qtdeTrocar = sc.nextDouble();
		double x = ConversorMoeda.convertMoeda(valor, qtdeTrocar);
		double y = ConversorMoeda.calcularIOF(valor, qtdeTrocar);
		

		System.out.println("Valor retornado em reais é de R$ "+ x);
		System.out.println("O valor do IOF reais é de R$ "+ y);

	
		
			
		
		
		sc.close();
	}

}
