package app;

import grafos.arestas.vertices.*;
import java.util.Scanner;

public class App {
	
	static Scanner leitor = new Scanner(System.in);
	static Grafos grafo = new Grafos();
	
	public static void main (String[] args) {
		System.out.println("Insira o número de vertices do grafo: ");
		grafo.setTotalVertices(leitor.nextInt());
		
		grafo.montarGrafo();
	}
}
