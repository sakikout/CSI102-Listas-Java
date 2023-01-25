package firma;

public class Cliente extends Pessoa {
	private double valorDivida;
	private int anoNascim;
	
	public void setDivida(double divida) {
		this.valorDivida = divida;
	}
	
	public double getDivida() {
		return this.valorDivida;
	}
	
	public void setNascimento(int nascimento) {
		this.anoNascim = nascimento;
	}
	
	public int getNascimento() {
		return this.anoNascim;
	}
	
	public Cliente(String nome, int idade,String sexo, double divida, int nasc) {
		super(nome, idade, sexo);
		this.anoNascim = nasc;
		this.valorDivida = divida;
	}
	
	@Override
	public String toString() {
		return "Cliente " + this.getNome() + " de " + this.getIdade() + " anos, do ano de " + this.anoNascim + " do sexo " + this.getSexo() + " com divida no valor de  " + this.valorDivida + " reais.";
	}
}
