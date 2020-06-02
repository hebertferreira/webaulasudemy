import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String lastNome;
		char ap1;
		char ap2;
		String apelido1;
		String apelido2;
		String apelido;
		int idade;
		double altura;
		
		System.out.println("Olá, qual seu nome?");
		nome = sc.next();
		System.out.println("Olá, qual seu ultimo nome?");
		lastNome = sc.next();
		System.out.printf("Bem vindo %s %s.%n", nome, lastNome);
		ap1 = nome.charAt(0);
		ap2 = lastNome.charAt(0);
		apelido1= Character.toString(ap1);
		apelido2= Character.toString(ap2);
		apelido = apelido1+apelido2;
		System.out.printf("Posso colocar seu apelido de %s?%n", apelido);
		System.out.printf("Qual sua idade %s?:%n", nome);
		idade = sc.nextInt();
		if(idade <=29) {
			System.out.printf("Está novo ainda %s.%n", nome);
		}else if (idade <=39) {
			System.out.printf("Preocupante, mas ainda da pro gasto, né %s?", nome);
		}else {
			System.out.printf("Opa %s, já fez seu plano funerário?%n", nome);
		}
		
		System.out.printf("Qual sua altura %s?%n", nome);
		altura = sc.nextDouble();
		System.out.printf("Você tem %.2f %s?%nNossaa!!!%n", altura, nome);
		sc.close();
		System.out.printf("Bem chega de perguntas. Até a proxima %s!%n", nome);
	}

}
