package lanchonetefactory;

public class FabricadeSanduichesRT implements SanduichesIngredientFactory {
	private FabricadeSanduichesRT instance = null;

	public Sanduiche criarSanduicheRT() {
		Pao paoRT = new Pao("bola", "circulo");
		Queijo queijoRT = new Queijo("cheddar");
		Presunto presuntoRT = new Presunto("peru");
		Salada saladaRT = new Salada("nao");
		
		return new Sanduiche(paoRT, queijoRT, presuntoRT, saladaRT);
	}

	@Override
	public SanduichesIngredientFactoryCG criarFabricaCG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanduichesIngredientFactoryJP criarFabricaJP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FabricadeSanduichesRT criarFabricaRT() {
		if (this.instance == null) {
			this.instance = new FabricadeSanduichesRT();
		}
		return this.instance;
	}

}
