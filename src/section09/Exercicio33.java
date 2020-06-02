package section09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario33;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario33> listFunc = new ArrayList<>();
		
		//Parte 1 - Armazenar Funcioanrios

		System.out.print("Informe quantos funcionarios há na empresa: ");
		int numFunc = sc.nextInt();		
		
		for(int i=1;i<=numFunc;i++) {
			
			System.out.println("======================================");
			System.out.println("Funcionario #"+ i);
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("SALARIO: ");
			Double salario = sc.nextDouble();	
			
			listFunc.add(new Funcionario33(id, nome, salario));
		}
		
		System.out.printf("Informe o ID do funcionario que terá o aumento salarial: ");
		int id = sc.nextInt();
		System.out.print("Informe o percentual do aumento: ");
		double percAumento = sc.nextDouble();
		
		
		// PARTE 3 Mostrar o salario dos funcionarios.
	
		Funcionario33 func = listFunc.stream().filter(x -> x.getId()==id).findFirst().orElse(null);	
		func.aumentarSalario(percAumento);
		
		// PARTE 4 Listar Funcionarios
		for(Funcionario33 obj : listFunc) {
			System.out.println(obj);
		}
		
		// PARTE 5 Demitir Funcionario
		
		System.out.print("Informe o funcionario que deseja demitir: ");
		sc.nextLine();
		String nome = sc.nextLine(); 
		listFunc.removeIf(x -> x.getNome()==nome);
		
		// PARTE 6 Listar Funcionarios
		for(Funcionario33 obj : listFunc) {
		System.out.println(obj);
		}
	sc.close();	
	}
	

}
