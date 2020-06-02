package section06;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int countInicial;
		int countIn =0;
		int countOut =0;
		
		System.out.print("Digite a quantidade de entradas que será analisado: ");
		countInicial = sc.nextInt();
		
		System.out.print("Agora digite um numero para analise: ");
		num=sc.nextInt();
		
		for(int i = 0; i < countInicial; i++) {
			
			if(num > 9 && num < 21) {
				countIn = countIn + 1; 
				System.out.printf("%d in%n", countIn);
			}else {
				countOut = countOut + 1; 
				System.out.printf("%d out%n", countOut);
			}
			if(i != countInicial -1) {
				System.out.print("Digite proximo numero da analise: ");
				num=sc.nextInt();
			}else {
				System.out.println("FIM");
			}
		}		
		sc.close();
	}

}
