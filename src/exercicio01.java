import java.util.Locale;

public class exercicio01 {

	public static void main(String[] args) {

		String produto01 = "Computador";
		String produto02 = "Laptop";
		
		int idade = 30;
		int codigo = 5290;
		char gender = 'F';
		
		double preco01 = 2100.0;
		double preco02 = 650.5;
		double medida = 53.234567;
		double total = preco01+preco02;
		
		System.out.println("Produtos:");
		System.out.printf("%s no valor de R$ %.2f.%n", produto01, preco01);
		System.out.printf("%s no valor de R$ %.2f.%n %n", produto02, preco02);
		System.out.printf("TOTAL = R$%.2f %n %n", total);
		System.out.printf("Record: %d years old, codigo %d, sexo '%s'%n", idade, codigo, gender);
		System.out.printf("Medida Brasileira = %.3f.%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Medida US = %.3f.%n", medida);
		
	}

}
