package animalia;

public class Cachorro extends Animal{
	private String raça;
	
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public String getRaça() {
		return this.raça;
	}
	
	public Cachorro (String nome, double peso, String raça ) {
		super(nome, peso);
		this.raça = raça;
	}
	
	@Override
	public String toString() {
		return "O cachorro da raça " + this.raça +  " se chama " + this.getNome() + " e pesa " + this.getPeso() + "kg";
	}
}
