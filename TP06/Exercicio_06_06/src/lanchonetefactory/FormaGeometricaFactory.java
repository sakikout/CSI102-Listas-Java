package lanchonetefactory;

public class FormaGeometricaFactory {
	public static FormaGeometrica criarForma(String forma) {
		if(forma == null) {
			return null;
		}
		
		if (forma.equalsIgnoreCase("triangulo")) {
			return new Triangulo();
		} else if (forma.equalsIgnoreCase("quadrado")) {
			return new Quadrado();
		} else if (forma.equalsIgnoreCase("circulo")) {
			return new Circulo();
		}
		
		return null;
	}
}
