package lanchonetefactory;

public class Queijo {
	private String tipo;
	
	public Queijo (String tipo) {
		if (tipo.equalsIgnoreCase("prato") || tipo.equalsIgnoreCase("mussarela")|| tipo.equalsIgnoreCase("cheddar") ) {
			this.tipo = tipo;
		} else {
			this.tipo = null;
			System.out.println("Tipo inválido.");
		}
	}
	
	public String toString() {
		return this.tipo;
	}
}
