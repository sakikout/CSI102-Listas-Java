package animalia;

public class Peixe extends Animal {
	
	private String tipoHabitat;
	
	public void setHabitat(String habitat) {
		this.tipoHabitat = habitat;
	}
	
	public String getHabitat() {
		return this.tipoHabitat;
	}
	
	public Peixe (String nome, double peso, String habitat ) {
		super(nome, peso);
		this.tipoHabitat = habitat;
	}
	
	@Override
	public String toString() {
		return "O peixe se chama " + this.getNome() + ", vive no habitat " + this.tipoHabitat + " e pesa " + this.getPeso() + "kg";
	}
}
