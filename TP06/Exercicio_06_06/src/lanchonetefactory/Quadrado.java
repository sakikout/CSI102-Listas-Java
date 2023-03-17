package lanchonetefactory;

public class Quadrado implements FormaGeometrica {
	@Override
	public void desenhar() {
		System.out.println("A forma do pão é quadrada");
		
	}
	
	@Override
	public String toString() {
		return "Quadrado";
	}

}
