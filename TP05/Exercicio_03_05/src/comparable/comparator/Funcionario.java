package comparable.comparator;

public class Funcionario extends DataEmpregado {
	private String ID;
	private String nome;
	private double salario;
	
	public Funcionario(String id, String nome, double salario, int dia, int mes, int ano) {
		super(dia, mes, ano);
		this.ID = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String mostrarFuncionario() {
		return "Funcionario " + this.nome + " do ID " + this.ID + " com salario de " + this.salario + " reais. ";
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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
	
	
}
