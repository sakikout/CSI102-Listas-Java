package mapa.funcionario;

public abstract class Identifier {
	private String ID;
	
	public void setID(String id) {
		this.ID = id;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public Identifier (String id) {
		this.ID = id;
	}
	
	public Identifier () {
	}
	
	public abstract String getFuncionario(String id);
	public abstract void mostrarInformacoes();
}
