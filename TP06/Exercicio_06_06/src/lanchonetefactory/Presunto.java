package lanchonetefactory;

public class Presunto {
	private String carne;
	
	public Presunto(String carne) {
		if (carne.equalsIgnoreCase("peru") || carne.equalsIgnoreCase("frango") ) {
			this.carne = carne;
			
		} else {
			this.carne = null;
			System.out.println("Tipo inválido.");
		}
	}
	
	public String toString() {
		return this.carne;
	}
}
