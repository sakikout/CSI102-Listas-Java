package formageometrica;

public class Mesa {
	private FormaGeometrica formato;
	
	public Mesa(String forma) {
		this.formato = FormaGeometricaFactory.criarForma(forma);
	}
	
	public FormaGeometrica getFormato() {
		return this.formato;
	}
}
