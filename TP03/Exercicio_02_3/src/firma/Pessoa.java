package firma;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String toString() {
		return this.nome + ", " + this.idade + " anos, sexo " + this.sexo;
	}
}
