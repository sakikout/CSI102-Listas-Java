package incremental;

public class TesteIncrementalSingleton {
	public static void main (String[] args) {
		// será imprimido o mesmo incremento, pois está sendo utilizado a mesma intancia.
		for(int i = 0; i < 10; i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}
	}
}
