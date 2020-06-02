package entidades;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double calculaArea() {
		
		double area;
		
		return area = largura * altura; 		
	}
	
	public double calculaPerimentro() {
		
		double p;
		
		return p = 2 * altura + 2 * largura;
	}
	
	public double calculaDiagonal() {
		
		double d;
		
		return d = largura * altura / 2;
	}
	
	public String toString() {
		
		return "Area: " + String.format("%.2f.\n", calculaArea()) + 
				"Perimetro: " + String.format("%.2f.\n", calculaPerimentro()) +
				"Diagonal: " + String.format("%.2f.\n", calculaDiagonal());
	}

}
