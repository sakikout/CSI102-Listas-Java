package conta;

public class ContaExcecao extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ContaExcecao() {
		super("Dinheiro solicitado está fora dos limites da conta.");
	}
	

}
