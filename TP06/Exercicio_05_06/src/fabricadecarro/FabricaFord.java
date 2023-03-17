package fabricadecarro;

public class FabricaFord extends FabricadeCarro{

	@Override
	public CarroSedan criarCarroSedan(String carro) {
		return null;
	}

	@Override
	public CarroPopular criarCarroPopular(String carro) {
		if (carro.equalsIgnoreCase("palio")) {
			return new Palio();
		} else if (carro.equalsIgnoreCase("fiesta")) {
			return new Fiesta();
		} else {
			System.out.println("Invalido.");
			return null;
		}
	}

}
