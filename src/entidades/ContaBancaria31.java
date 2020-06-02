package entidades;

public class ContaBancaria31 {
	
	private String titular;
	private String numeroConta;
	private double saldo;

	
	public ContaBancaria31(String titular, String numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
		
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//NAO USAR POR SEGURANÇA
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	} */
	
	
	public String toString () {
		
		return "Titular: "+ getTitular() +"\nNumero da Conta: " + getNumeroConta() + "\nSaldo atual: " + String.format("%.2f", getSaldo())+"\n";
	}
	
	public void depositarMoney(double valor) {
		this.saldo += valor;		
	}
	
	public void retirarMoney(double valor) {
		this.saldo -= valor;
		this.saldo = this.saldo - (this.saldo * 5 / 100);
	}
			
}
