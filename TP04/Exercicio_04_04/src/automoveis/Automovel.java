package automoveis;

public class Automovel extends Veiculo {
	
	private double oleo = 0;
	private double maxOleo = 50;
	private boolean estaCheio = false, estaVazio = true;
	
	public Automovel(String nome) {
		super(nome, "Automovel");
	}
	
	public void mudarOleo(double num) {
		if (this.estaCheio == true) {
			System.out.println("O tanque está cheio!");
		} else {
			this.oleo += num;
			
			if (this.oleo == this.maxOleo) {
				this.estaCheio = true;
			} else {
				this.estaCheio = false;
			}
				
			if (this.oleo == 0) {
				this.estaVazio = true;
			} else {
				this.estaVazio = false;
			}
			
			System.out.println("O óleo foi mudado!");
		}
	}
	
	@Override
	public void listarVerificacoes() {
		if(this.estaCheio == true) {
			System.out.println("O automóvel está com o tanque cheio.");
		} else if (this.estaVazio == true) {
			System.out.println("O automóvel está com o tanque vazio.");
		}
		
		int sorte = (int)(Math.random() * 4 + 1);
		
		switch (sorte) {
		case 1:	System.out.println("Além disso, possui todos os componentes em perfeito estado. Não é preciso fazer ajustes.");
		System.out.println("----------------------------------------");
			break;
		case 2: System.out.println("Além disso, é preciso consertar o parachoque e trocar os pneus traseiros.");
		System.out.println("----------------------------------------");
			break;
		case 3: System.out.println("Além disso, possui alguns arranhões na lateral do carro e um farol quebrado. É perigoso demais deixar sem ajustar!");
		System.out.println("----------------------------------------");
			break;
		case 4: System.out.println("Além disso, a bateria está descarregada, a marcha está quebrada e é reparar os retrovisores. É preciso ajustar e pode levar um tempo!");
		System.out.println("----------------------------------------");
			break;
		default: System.out.println("Desculpe, tente verificar outra hora.");
		System.out.println("----------------------------------------");
			break;
		}
		
	}
	
	@Override
	public void ajustar() {
		int sorte = (int)(Math.random() * 4 + 1);
		
		switch (sorte) {
		case 1:	System.out.println("Todos os componentes foram ajustados rapidamente!");
		System.out.println("----------------------------------------");
			break;
		case 2: System.out.println("Os componentes foram ajustados, mas seu automóvel é antigo demais e pode dar problema em breve.");
		System.out.println("----------------------------------------");
			break;
		case 3: System.out.println("Os componentes foram ajustados, mas você terá que pagar mais R$500, pois encontramos problemas sérios no motor!");
		System.out.println("----------------------------------------");
			break;
		case 4: System.out.println("Alguns componentes foram ajustados, mas é preciso trazer o automóvel novamente para finalizar.");
		System.out.println("----------------------------------------");
			break;
		default: System.out.println("Desculpe, tente verificar outra hora.");
		System.out.println("----------------------------------------");
			break;
		}
	}
	
	@Override
	public void limpar() {
		int sorte = (int)(Math.random() * 3 + 1);
		
		switch(sorte){
			case 1: System.out.println("O automóvel foi limpo!");
			System.out.println("----------------------------------------");
				break;
			case 2: System.out.println("O automóvel já está limpo!");
			System.out.println("----------------------------------------");
				break;
			case 3: System.out.println("O automóvel foi limpo, mas precisará ser limpo novamente em breve.");
			System.out.println("----------------------------------------");
				break;
			default: System.out.println("O automóvel está muito sujo, então precisará trazê-lo novamente para limpar.");
			System.out.println("----------------------------------------");
				break;
		}
		
	}
	
}
