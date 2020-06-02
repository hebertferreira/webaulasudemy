package section08;

import java.util.Scanner;

import entidades.Aluno;

public class Exercicio27C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno novoAluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		novoAluno.nome = sc.nextLine();
		System.out.println();
		System.out.print("Primeira Nota: ");
		novoAluno.n1 = sc.nextDouble();
		while(novoAluno.n1 < 0 || novoAluno.n1 > 30) {
			
			if(novoAluno.n1 > 0 || novoAluno.n1 < 31) {
				novoAluno.n1 = novoAluno.n1;
			}else{
				System.out.print("ERRO!! ");
			}

			System.out.println("Digite novamente a nota dentro do limite 0 à 30 ");
			System.out.print("Primeira Nota: ");
			novoAluno.n1 = sc.nextDouble();
		}
		
		System.out.print("Segunda Nota: ");
		novoAluno.n2 = sc.nextDouble();
	
		while(novoAluno.n2 < 0 || novoAluno.n2 > 35) {
			
			if(novoAluno.n2 > 0 || novoAluno.n2 < 36) {
				novoAluno.n2 = novoAluno.n2;
			}else{
				System.out.print("ERRO!! ");
			}

			System.out.println("Digite novamente a nota dentro do limite 0 à 35 ");
			System.out.print("Segunda Nota: ");
			novoAluno.n2 = sc.nextDouble();
		}		
		
		System.out.print("Terceira Nota: ");
		novoAluno.n3 = sc.nextDouble();
		
		while(novoAluno.n3 < 0 || novoAluno.n3 > 35) {
			
			if(novoAluno.n3 > 0 || novoAluno.n3 < 36) {
				novoAluno.n3 = novoAluno.n3;
			}else{
				System.out.print("ERRO!! ");
			}

			System.out.println("Digite novamente a nota dentro do limite 0 à 35 ");
			System.out.print("Terceira Nota: ");
			novoAluno.n3 = sc.nextDouble();
		}
		
		novoAluno.exibirMediaFinal();
		System.out.println();
		
		novoAluno.verificaoAprovacao();
		
		sc.close();
	}

}
