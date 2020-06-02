package util;

public class ConversorMoeda {
	
	public static final int iof = 6;
	
	public static double convertMoeda(double valor, double qtdeTrocar) {
		
		double moedaConvertida = valor * qtdeTrocar;
		
		
		return  moedaConvertida;
	}
	
	public static double calcularIOF(double valor, double qtdeTrocar) {

		double moedaConvertida = valor * qtdeTrocar;
		
		return  moedaConvertida * iof / 100;
	}
	

}
