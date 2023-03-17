package lanchonetefactory;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {
	private SanduichesIngredientFactoryJP instance = null;
	
	public Sanduiche criarSanduicheJP() {
		Pao paoJP = new Pao("frances", "triangulo");
		Queijo queijoJP = new Queijo("mussarela");
		Presunto presuntoJP = new Presunto("frango");
		Salada saladaJP = new Salada("sim");
		
		return new Sanduiche(paoJP, queijoJP, presuntoJP, saladaJP);
	}

	@Override
	public SanduichesIngredientFactoryCG criarFabricaCG() {
		return null;
	}

	@Override
	public SanduichesIngredientFactoryJP criarFabricaJP() {
		if (this.instance == null) {
			this.instance = new SanduichesIngredientFactoryJP();
		}
		return this.instance;
	}

	@Override
	public FabricadeSanduichesRT criarFabricaRT() {
		return null;
	}


}
