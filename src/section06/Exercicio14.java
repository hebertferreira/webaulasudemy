package section06;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		int senhaCorreta = 2202;
		int count =0;
		
		System.out.println("Digite sua senha:");
		
		senha = sc.nextInt();
		
		while(senha != senhaCorreta) {
			
			count = count + 1;
			System.out.printf("Senha incorreta. %dº tentativa.%nDigite novamente: ", count);
			senha = sc.nextInt();
			System.out.println("");

		}
		
		System.out.println("SENHA CORRETA!");
		
		sc.close();
	}

}
