package section09;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
		/**************** MATRIZ BIDIMENSIONAL  ******************/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int [n][n];
		int negativeCount = 0;
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("Digite: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal");
		
		for(int i = 0; i < n; i++) {
			System.out.println(matriz[i][i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					negativeCount++;
				}
			}
		}
		
		System.out.println("Numeros negativos: "+negativeCount);
		
		sc.close();
	}

}
