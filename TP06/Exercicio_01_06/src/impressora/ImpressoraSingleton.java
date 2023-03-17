package impressora;

public class ImpressoraSingleton {
	private static ImpressoraSingleton instance = null;
	
	private ImpressoraSingleton() {
		
	}
	
	public static ImpressoraSingleton getInstance() {
		if (instance == null) {
			instance = new ImpressoraSingleton();
		}
		
		return instance;
	}
	
	public void imprimir(String relatorio) {
		System.out.println("------------RELATORIO------------");
		System.out.println(relatorio);
		System.out.println("---------------------------------");
	}
}
