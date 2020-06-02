package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public String mostrarDadosFuncionario() {
		
		return "Nome: " + nome + "\n" +
				"Salario Bruto: " + String.format("%.2f", this.salarioBruto) + "\n" +
				"Imposto: " + String.format("%.2f", this.imposto)+ "\n"+
				"Salario Liquido: " + String.format("%.2f.\n", this.salarioBruto - this.imposto);
	}
	
	public double aumentarSalario(double porcentagem) {
		
		salarioBruto += salarioBruto * porcentagem / 100; 
		return salarioBruto;
	}
	
	public double reduzirSalario(Double porcentagem) {

		salarioBruto -= salarioBruto * porcentagem / 100; 
		return salarioBruto;
	}	
	

}
