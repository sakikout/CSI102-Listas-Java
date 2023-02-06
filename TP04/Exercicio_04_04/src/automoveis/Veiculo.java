package automoveis;

public abstract class Veiculo {
	
	private String dono;
	private String tipo;
	
	public void setDono(String nome) {
		this.dono = nome;
	}
	public String getDono() {
		return this.dono;
	}
	
	public void setTipo(String nome) {
		this.tipo = nome;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public Veiculo(String nome, String tipo) {
		this.dono = nome;
		this.tipo = tipo;
	}
	
	public abstract void listarVerificacoes();
	public abstract void ajustar();
	public abstract void limpar();
	
}
