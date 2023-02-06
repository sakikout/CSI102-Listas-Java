package cartoes.datas;

public abstract class CartaoWeb {
	private String destinatario;
	
	public void setDestinatario(String nome) {
		this.destinatario = nome;
	}
	
	public String getDestinatario() {
		return this.destinatario;
	}
	
	public abstract void showMessage();
}
