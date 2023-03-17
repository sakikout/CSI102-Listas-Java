package formageometrica;

public class Circulo implements FormaGeometrica  {
	private double raio = 3;
	private double pi = 3.14159265;
	private double perimetro;
	private double area;
	
	@Override
	public void exibirForma() {
		System.out.println("A forma é um circulo");
		
	}

	@Override
	public void calcularPerimetro() {
		this.perimetro = 2 * this.pi * this.raio;
		System.out.println("Perimetro: " + this.perimetro);
	}

	@Override
	public void calcularArea() {
		this.area = this.pi * (this.raio * this.raio);
		System.out.println("Area: " + this.area);
	}

}
