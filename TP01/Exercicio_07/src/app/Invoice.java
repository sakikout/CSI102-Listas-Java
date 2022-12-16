package app;

public class Invoice {
	private  int numero;
	private  String descricao;
	private  int quantidade;
	private  float preco;
	//private static float amount;
	
	/*public Invoice(int num, String desc, int qntd, float preco) {
		this.numero = num;
		this.descricao = desc;
		if ( qntd < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = qntd;
		}
		if (preco < 0) {
			this.preco = (float) 0.0;
		} else {
			this.preco = preco;
		}
	}
	*/
	
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDesc(String desc) {
		this.descricao = desc;
	}
	
	public String getDesc() {
		return descricao;
	}
	
	public void setQuantidade(int num) {
		this.quantidade = num;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(float num) {
		this.preco = num;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public double getInvoiceAmount(int qntd, float preco) {
		return qntd * preco;
	}
}
