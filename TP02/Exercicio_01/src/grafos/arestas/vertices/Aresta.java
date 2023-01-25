package grafos.arestas.vertices;

public class Aresta {

	private int v;
	private int w;
	
	public Aresta(int v, int w) {
		this.v = v;
		this.w = w;
	}
	
	public void getParOdernado(int i) {
		System.out.printf("A[%d] = (%d, %d)\n ", i + 1, this.v, this.w);
	}

	
	public int getNum1() {
		return this.v;
	}
	
	public int getNum2() {
		return this.w;
	}
	
}
