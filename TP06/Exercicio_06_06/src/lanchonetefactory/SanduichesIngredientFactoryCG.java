package lanchonetefactory;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {
	private SanduichesIngredientFactoryCG instance = null;
	
	public Sanduiche criarSanduicheCG() {
		Pao paoCG = new Pao("integral", "quadrado");
		Queijo queijoCG = new Queijo("prato");
		Presunto presuntoCG = new Presunto("frango");
		Salada saladaCG = new Salada("nao");
		
		return new Sanduiche(paoCG, queijoCG, presuntoCG, saladaCG);
	}

	@Override
	public SanduichesIngredientFactoryCG criarFabricaCG() {
		if (this.instance == null) {
			this.instance = new SanduichesIngredientFactoryCG();
		}
		return this.instance;
	}

	@Override
	public SanduichesIngredientFactoryJP criarFabricaJP() {
		return null;
	}

	@Override
	public FabricadeSanduichesRT criarFabricaRT() {
		return null;
	}



}
