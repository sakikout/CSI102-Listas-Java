package floricultura;

public class Plantas {
	
	public String nome_planta;
	public int estoque_ideal;
	public int quantidade_estoque;
	public int quantidade_comprar;
	
	/*public Plantas (String nome, int ideal, int estoque, int comprar) {
		this.nome_planta = nome;
		this.estoque_ideal = ideal;
		this.quantidade_estoque = estoque;
		this.quantidade_comprar = comprar;
	}
	*/


	public void setNome(String nome) {
		this.nome_planta = nome;
	}
	
	public String getNome() {
		return this.nome_planta;
	}
	
	public void setEstoqueIdeal(int num) {
		this.estoque_ideal = num;
	}
	
	public int getEstoqueIdeal() {
		return this.estoque_ideal;
	}
	
	public int setQuantidadeComprar() {
		this.quantidade_comprar = this.estoque_ideal - this.quantidade_estoque;
		
		if (this.quantidade_comprar <= 0) {
			this.quantidade_comprar = 0;
		}
		
		return this.quantidade_comprar;
	}
	
	public int getQuantidadeComprar() {
		return this.quantidade_comprar;
	}
	
	public void setQuantidadeEstoque(int num) {
		this.quantidade_estoque = num;
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidade_estoque;
	}
	
}
