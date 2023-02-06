package automoveis;

public class Bicicleta extends Veiculo{
	
	public Bicicleta(String nome) {
		super(nome, "Bicicleta");
	}
	
	@Override
	public void listarVerificacoes() {
		
		int sorte = (int)(Math.random() * 4 + 1);
		
		switch (sorte) {
		case 1:	System.out.println("Os pneus precisam ser trocados.");
		System.out.println("----------------------------------------");
			break;
		case 2: System.out.println("A corrente precisa ser trocada.");
		System.out.println("----------------------------------------");
			break;
		case 3: System.out.println("O freio está com problema.");
		System.out.println("----------------------------------------");
			break;
		case 4: System.out.println("A bicicleta está em perfeito estado!");
		System.out.println("----------------------------------------");
			break;
		default: System.out.println("Desculpe, tente verificar outra hora.");
		System.out.println("----------------------------------------");
			break;
		}
		
	}
	
	@Override
	public void ajustar() {
		int sorte = (int)(Math.random() * 3 + 1);
		
		switch (sorte) {
		case 1:	System.out.println("Todos os componentes foram ajustados rapidamente!");
		System.out.println("----------------------------------------");
			break;
		case 2: System.out.println("Os componentes foram ajustados, mas a bicicleta pode dar problema novamente em breve.");
		System.out.println("----------------------------------------");
			break;
		case 3: System.out.println("A bicicleta terá que ficar mais um tempo para terminar de ajustar.");
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
			case 1: System.out.println("A bicleta está limpa!");
			System.out.println("----------------------------------------");
				break;
			case 2: System.out.println("A bicileta foi limpa!");
			System.out.println("----------------------------------------");
				break;
			case 3: System.out.println("A bicicleta estava muito suja, então precisará voltar para terminar de ser limpa.");
			System.out.println("----------------------------------------");
				break;
			default: System.out.println("Não foi possível terminar a limpeza da bicicleta. Tente novamente mais tarde!");
			System.out.println("----------------------------------------");
				break;
		}
		
	}
}
