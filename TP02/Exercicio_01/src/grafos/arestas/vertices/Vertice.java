package grafos.arestas.vertices;

public class Vertice {
	
	private int numero;
	private int totalAresta;
	public static int totalVertices;
	private Aresta[] aresta;
	
	public Vertice(int num, int total) {
		this.numero = num;
		Vertice.totalVertices = total;
		
		if(num == 1 || num == 2 && total > 3) {
			this.totalAresta = 2;
		} else if (total % 2 != 0 && num == total){
			this.totalAresta = 2;
		} else if (total %2 == 0 && num == total || num == total - 1){
			this.totalAresta = 2;
		} else if(num == 1 || num == 3 && total <= 3) {
			this.totalAresta = 1;
		}
		else {
			this.totalAresta = 3;
		}
		this.aresta = new Aresta[totalAresta];
		this.setArestas();
	}
	
	private void setArestas() {
		int vertex = this.numero;
		int total = Vertice.totalVertices;
		
		if(vertex == 1 && total <= 3) {
			aresta[0] = new Aresta(1, 2);
			
		} else if(vertex == 1 && total > 3) {
			aresta[0] = new Aresta(1, 2);
			aresta[1] = new Aresta(1, 4);
			
		}else if(vertex == 2 && total >= 3) {
			aresta[0] = new Aresta(vertex, vertex + 1);
			aresta[1] = new Aresta(vertex, vertex - 1);
			
		} else if(vertex == 2 && total == 2) {
			aresta[0] = new Aresta(vertex, vertex - 1);
			
		} else if (vertex == total - 1 || vertex == total && total % 2 == 0) {
			aresta[0] = new Aresta(vertex, vertex + 1);
			aresta[1] = new Aresta(vertex, vertex - 1);
		} else if (vertex == total && total % 2 != 0) {
			aresta[0] = new Aresta(vertex, vertex + 1);
			aresta[1] = new Aresta(vertex, vertex - 1);
		}
			else {
			aresta[0] = new Aresta(vertex, vertex + 1);
			aresta[1] = new Aresta(vertex, vertex - 1);
			
			for (int i = 3; i < total; i += 2) {
				if (vertex == i) {
				aresta[2] = new Aresta(vertex, vertex + 3);
					
			} else if (vertex == i + 1) {
				aresta[2] = new Aresta(vertex, vertex + 3);
			}
		}
		

		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getTotalArestas() {
		return this.totalAresta;
	}
	
	public void getArestas() {
		for(int i = 0; i < this.totalAresta; i ++) {
			aresta[i].getParOdernado(i);
		}
	}
	
	public void getIncidencias() {
		System.out.printf("%d     ", this.numero );
		for(int i = 0; i < this.totalAresta; i ++) {
		System.out.printf(" %d ", aresta[i].getNum2());
		}
		System.out.printf("\n");
	}
}

