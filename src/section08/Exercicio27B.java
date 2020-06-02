package section08;

import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio27B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario novoFuncionario = new Funcionario();
		
		System.out.print("Digite o nome do funcionario: ");
		novoFuncionario.nome = sc.nextLine();
		
		System.out.print("Digite o salario bruto do funcionario: ");
		novoFuncionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o valor do imposto mensal desse funcionario: ");
		novoFuncionario.imposto = sc.nextDouble();
		
		System.out.println(novoFuncionario.mostrarDadosFuncionario());
		System.out.println();
		
		double porcentagem;
		System.out.print("Digite quantos porcentos irá aumentar o salario da " + novoFuncionario.nome + ": ");
		porcentagem = sc.nextDouble();
		novoFuncionario.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println(novoFuncionario.mostrarDadosFuncionario());
		System.out.println();
		
		System.out.print("Digite quantos porcentos irá reduzir o salario da " + novoFuncionario.nome + ": ");
		porcentagem = sc.nextDouble();
		novoFuncionario.reduzirSalario(porcentagem);
		System.out.println();
		System.out.println(novoFuncionario.mostrarDadosFuncionario());
		System.out.println();
				 
		

		sc.close();
	}

}
