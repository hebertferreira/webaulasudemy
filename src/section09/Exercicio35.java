package section09;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		/*EXERCICIO MATRIZ BIDIMENCIONAL*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantas colunas terá a matriz: ");
		int col = sc.nextInt();
		System.out.print("Informe quantas linhas terá a matriz: ");
		int lin = sc.nextInt();
		int mtz[][] = new int[lin][col]; 
		
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("Digite: ");
				mtz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(mtz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("Informe o numero que está buscando: ");
		int proc = sc.nextInt();
		
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				if(mtz[i][j]==proc) {
					System.out.println("Latitude: "+ i);
					System.out.println("Longitude: "+ j);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
