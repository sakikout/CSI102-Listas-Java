package lanchonetefactory;

public class Pao {
	private FormaGeometrica formato;
	private String tipo;
	
	public Pao (String tipo, String forma) {
		if (tipo.equalsIgnoreCase("integral") || tipo.equalsIgnoreCase("bola")|| tipo.equalsIgnoreCase("frances") ) {
			this.tipo = tipo;
		} else {	
			this.tipo = null;
			System.out.println("Tipo inválido.");
		}
		
		this.formato = FormaGeometricaFactory.criarForma(forma);
		//this.formato.desenhar();
	}
	
	public String toString() {
		return this.tipo + ", formato de " + this.formato.toString();
	}
}	
