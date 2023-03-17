package lanchonetefactory;

public class Fabricar implements SanduichesIngredientFactory {

	@Override
	public SanduichesIngredientFactoryCG criarFabricaCG() {
		SanduichesIngredientFactoryCG fabrica = new SanduichesIngredientFactoryCG();
		return fabrica.criarFabricaCG();
	}

	@Override
	public SanduichesIngredientFactoryJP criarFabricaJP() {
		SanduichesIngredientFactoryJP fabrica = new SanduichesIngredientFactoryJP();
		return fabrica.criarFabricaJP();
	}

	@Override
	public FabricadeSanduichesRT criarFabricaRT() {
		FabricadeSanduichesRT fabrica = new FabricadeSanduichesRT();
		return fabrica.criarFabricaRT();
	}

}
