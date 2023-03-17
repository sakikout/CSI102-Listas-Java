package lanchonetefactory;

public class Sanduiche {
	private Pao pao;
	private Queijo queijin;
	private Presunto bife;
	private Salada salada;
	
	public Sanduiche(Pao pao, Queijo queijo, Presunto carne, Salada salada) {
		this.pao = pao;
		this.queijin = queijo;
		this.bife = carne;
		this.salada = salada;
	}
	
	public Sanduiche(SanduichesIngredientFactory fabrica) {
		if(fabrica.getClass().toString().equals("SanduichesIngredientFactoryCG")) {
			this.pao = new Pao("integral", "quadrado");
			this.queijin = new Queijo("prato");
			this.bife = new Presunto("frango");
			this.salada = new Salada("nao");
		} else if (fabrica.getClass().toString().equals("SanduichesIngredientFactoryJP")) {
			this.pao = new Pao("frances", "triangulo");
			this.queijin = new Queijo("mussarela");
			this.bife = new Presunto("frango");
			this.salada = new Salada("sim");
		} else if (fabrica.getClass().toString().equals("FabricadeSanduichesRT")) {
			this.pao = new Pao("bola", "circulo");
			this.queijin = new Queijo("cheddar");
			this.bife = new Presunto("peru");
			this.salada = new Salada("nao");
		} else {
			System.out.println("Houve um erro na criaçao do sanduiche.");
		}
	}
	
	public void mostrarPedido() {
		System.out.println("------------ PEDIDO ---------------");
		System.out.println("Pão: " + this.pao.toString());
		System.out.println("Quejo: " + this.queijin.toString());
		System.out.println("Presunto: " + this.bife.toString());
		System.out.println("Salada: " + this.salada.toString());
		
		System.out.println("-----------------------------------");
		
	}
}
