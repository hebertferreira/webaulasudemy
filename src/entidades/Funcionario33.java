package entidades;

public class Funcionario33 {
	
	private int id;
	private String nome;
	private double salario;
	
	
	public Funcionario33(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		
		return "ID: "+getId()+"\nNome: "+getNome()+"\nSalario: "+getSalario()+"\n";
	}
	
	public void aumentarSalario(double percAumento) {
		
		this.salario = this.salario + (this.salario * percAumento/100);
		
	}
	
	

}
