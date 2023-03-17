package formageometrica;

public class Triangulo implements FormaGeometrica  {
	private double lado1 = 3;
	private double lado2 = 3;
	private double base = 3;
	private double altura = 1;
	private double perimetro;
	private double area;
	
	@Override
	public void exibirForma() {
		System.out.println("A forma é um triângulo");
		
	}

	@Override
	public void calcularPerimetro() {
		this.perimetro = this.lado1 + this.lado2 + this.base;
		System.out.println("Perimetro: " + this.perimetro);
		
	}

	@Override
	public void calcularArea() {
		this.area = (this.altura * this.base) / 2;
		
		System.out.println("Area: " + this.area);
		
	}

}
