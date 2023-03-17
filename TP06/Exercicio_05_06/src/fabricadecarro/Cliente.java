package fabricadecarro;

public class Cliente {
	private String nome;
	private CarroSedan carroSedan;
	private CarroPopular carroPopular;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCarro(String fabrica, String carro) {
		if(fabrica.equalsIgnoreCase("sedan")) {
			FabricaFiat fiat = new FabricaFiat();
			this.carroSedan = fiat.criarCarroSedan(carro);
			
		} else if (fabrica.equalsIgnoreCase("popular")) {
			FabricaFord ford = new FabricaFord();
			this.carroPopular = ford.criarCarroPopular(carro);
		}
	}
	
	public void getCarro() {
		if (this.carroPopular != null) {
			this.carroPopular.exibirInfoPopular();
		} else if (this.carroSedan != null) {
			this.carroSedan.exibirInfoSedan();
		} else {
			System.out.println("O cliente não possui carros.");
		}
	}
	
	public void getInformacoesCliente() {
		if (this.carroPopular != null) {
			System.out.println("Cliente " + this.nome + " possui um " + this.carroPopular.toString());
		} else if (this.carroSedan != null) {
			System.out.println("Cliente " + this.nome + " possui um " + this.carroSedan.toString());
		} else {
			System.out.println("Cliente " + this.nome + " não possui carros.");
		}
	}
}
