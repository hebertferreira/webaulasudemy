package entidades;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double exibirMediaFinal(){
		
		return n1+n2+n3;
	}
	
	public void verificaoAprovacao() {
		
		if((n1+n2+n3) < 60) {
			System.out.println("REPROVADO");
		}else {
			System.out.println("PASSOU MALANDRAO");
		}
	}

}
