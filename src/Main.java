import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int m = 9;
		double x = 39.29453;
		System.out.printf("Olá estrangeiros do %dº Mundo!!!%nUtilizarei apenas %.4f do meu poder", m, x);
		Locale.setDefault(Locale.US);
		System.out.printf("Olá novamente troxas do %dº Mundo!!!%nAgora utilizarei %.4f do meu poder", m, x);

	}

}
