package incremental;

public class IncrementalSingleton {
	private static IncrementalSingleton instance = null;
	private static int count = 0;
	private int numero;
	
	public IncrementalSingleton() {
		numero = ++count;
	}
	
	public static IncrementalSingleton getInstance() {
		if (instance == null) {
			instance = new IncrementalSingleton();
		}
		
		return instance;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
