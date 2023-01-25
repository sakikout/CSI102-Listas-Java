package grafos.arestas.vertices;

public class Grafos {
	
	private int totalVertices;
	private Vertice[] vertice;

	public void setTotalVertices(int num) {
		this.totalVertices = num;
		this.vertice = new Vertice[totalVertices];
		
		for (int i = 0; i < num; i++) {
			vertice[i] = new Vertice (i + 1, num);
		}
	}
	
	public void montarGrafo() {
		System.out.printf("Incidências dos vértices\n");
		for (int i = 0; i < this.totalVertices; i ++) {
			vertice[i].getIncidencias();
		}
	}
	
}
