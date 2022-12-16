package semprebela.servicos;

public class Pessoa {
	
	private int salario;
	private String nome;
	private int manicure;
	private int pes;
	private int podologia;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario() {
		int total_servicos = (this.getManicure() * 20) + (this.getPedicure() * 25) + (this.getPodologia() * 30);
		int total = (total_servicos) / 2;
		this.salario = total;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setManicure(int num) {
		this.manicure = num;
	}
	
	public int getManicure() {
		return manicure;
	}
	
	public void setPedicure(int num) {
		this.pes = num;
	}
	
	public int getPedicure() {
		return pes;
	}
	
	public void setPodologia(int num) {
		this.podologia = num;
	}
	
	public int getPodologia() {
		return podologia;
	}
	
}
