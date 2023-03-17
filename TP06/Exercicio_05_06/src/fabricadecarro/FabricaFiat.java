package fabricadecarro;

public class FabricaFiat extends FabricadeCarro {
	
	@Override
	public CarroSedan criarCarroSedan(String carro) {
		if (carro.equalsIgnoreCase("siena")) {
			return new Siena();
		} else if (carro.equalsIgnoreCase("fiesta")) {
			return new FiestaSedan();
		} else {
			System.out.println("Invalido.");
			return null;
		}
	}

	@Override
	public CarroPopular criarCarroPopular(String carro) {
		return null;
	}

}
