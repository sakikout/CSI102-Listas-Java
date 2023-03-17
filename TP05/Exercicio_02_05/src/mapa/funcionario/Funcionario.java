package mapa.funcionario;

public class Funcionario extends Identifier {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario (String nome, String id, String cargo, double salario) {
		super(id);
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario (String nome, String id) {
		super(id);
		this.nome = nome;
		this.cargo = "Não informado.";
		this.salario = 0;
	}
	
	public String getFuncionario(String id) {
		if (!super.getID().equals(id)) {
			return "Funcionário não identificado.";
		} else {
			return "Funcionario: " + this.nome + ", ID " + super.getID();
		}
		
	}
	
	public void mostrarInformacoes() {
		System.out.println("---- INFORMAÇOES DO FUNCIONARIO -----");
		System.out.println("ID: " + super.getID());
		System.out.println("NOME: " + this.nome);
		System.out.println("CARGO: " + this.cargo);
		System.out.println("SALARIO: " + this.salario);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
