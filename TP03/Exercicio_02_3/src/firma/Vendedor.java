package firma;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private int qntdVendas;
	
	public void setValorVendas(double vendas) {
		this.valorVendas = vendas;
	}
	
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public void setQntdVendas(int vendas) {
		this.qntdVendas = vendas;
	}
	
	public int getQntdVendas() {
		return this.qntdVendas;
	}
	
	public Vendedor (String nome, int idade, String sexo, double salario, String matricula, int vendas, double valor) {
		super(nome, idade, sexo, salario, matricula);
		this.qntdVendas = vendas;
		this.valorVendas = valor;
	}
	
	@Override
	public String toString() {
		return "Vendedor " + this.getNome() + " de " + this.getIdade() + " anos, da matricula " + this.getMatricula() + " do sexo " + this.getSexo() + " com salario no valor de  " + this.getSalario() + " reais e INSS de " + this.valorInss() + " reais vendeu " + this.qntdVendas + " produtos no total de " + this.valorVendas + " reais";
	}
}
