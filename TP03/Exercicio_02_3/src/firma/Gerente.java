package firma;

public class Gerente extends Empregado {
	
	private String nomeGerencia;
	
	public void setGerencia(String ger) {
		this.nomeGerencia = ger;
	}
	
	public String getGerencia() {
		return this.nomeGerencia;
	}
	
	public Gerente(String nome, int idade, String sexo, double salario, String matricula, String gerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = gerencia;
	}
	
	@Override
	public String toString() {
		return "Empregado " + this.getNome() + " de " + this.getIdade() + " anos, da matricula " + this.getMatricula() + " e gerencia " + this.nomeGerencia + " do sexo " + this.getSexo() + " com salario no valor de  " + this.getSalario() + " reais e INSS de " + this.valorInss() + " reais.";
	}
}
