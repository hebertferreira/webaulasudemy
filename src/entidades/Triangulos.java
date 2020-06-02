package entidades;

public class Triangulos {

	// Utilizado no programa 25
		
	public double a;
	public double b;
	public double c;
	
	public double calcularArea() {
		
		double p, area;
		
		p =(a + b + c) / 2;
		area = Math.sqrt(p * (p - a)* (p - b)* (p - c));
		
		return area;
	}
}
	
	
	
	
