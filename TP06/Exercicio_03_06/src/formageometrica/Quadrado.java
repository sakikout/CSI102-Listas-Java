package formageometrica;

public class Quadrado implements FormaGeometrica {
	private double lado = 3;
	private double perimetro;
	private double area;
	
	@Override
	public void exibirForma() {
		System.out.println("A forma é um quadrado");
		
	}

	@Override
	public void calcularPerimetro() {
		this.perimetro = this.lado * 4;
		System.out.println("Perimetro: " + this.perimetro);
		
	}

	@Override
	public void calcularArea() {
		this.area = this.lado * this.lado;
		System.out.println("Area: " + this.area);
	}

}
