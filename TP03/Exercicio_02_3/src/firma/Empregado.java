package firma;

public class Empregado extends Pessoa {
	private double salario;
	private String matricula;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setMatricula(String mat) {
		this.matricula = mat;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public double valorInss() {
		return (this.salario * 0.11);
	}
	
	public Empregado(String nome, int idade,String sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Empregado " + this.getNome() + " de " + this.getIdade() + " anos, da matricula " + this.matricula + " do sexo " + this.getSexo() + " com salario no valor de  " + this.salario + " reais e INSS de " + this.valorInss() + " reais.";
	}

}
