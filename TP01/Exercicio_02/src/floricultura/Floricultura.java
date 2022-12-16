package floricultura;

import java.util.Scanner;

public class Floricultura {
	
	static Scanner leitor = new Scanner (System.in);
	
	public static void main (String[] args) {
		int n = 50;
		Plantas[] plantas = new Plantas [n];
		
		for (int i = 0; i < n; i++) {
			plantas[i] = new Plantas();
		}
		
		lerDados(plantas, n);
		
		imprimirRelatorio(plantas, n);
	}
	
	
	public static void lerDados (Plantas planta[], int n) {
		int i;
	
		for (i = 0; i < n; i++) {
			System.out.printf("Insira o nome da %d planta: ", i + 1);
			planta[i].setNome(leitor.next());
			
			System.out.println("Insira o estoque ideal para a planta " + planta[i].getNome() + ": ");
			planta[i].setEstoqueIdeal(leitor.nextInt());
			
			System.out.println("Insira o estoque atual para a planta " + planta[i].getNome() + ": ");
			planta[i].setQuantidadeEstoque(leitor.nextInt());
			
			planta[i].setQuantidadeComprar();
		}
		
	}
	
/*
 * 	public void mostrarDados(Plantas planta[], int n) {
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("--------------- DADOS ----------------");
			System.out.printf("NOME: %s\n", planta[i].getNome());
			System.out.printf("ESTOQUE IDEAL: %d\n", planta[i].getEstoqueIdeal());
			System.out.printf("ESTOQUE ATUAL: %d\n", planta[i].getQuantidadeEstoque());
			System.out.printf("QUANTIDADE PARA COMPRAR: %d\n", planta[i].getQuantidadeComprar());
			System.out.println("--------------------------------------");
		}
		
	}
 */
	
	public static void imprimirRelatorio(Plantas planta[], int n) {
		System.out.println("--------------- QUANTIDADE PARA COMPRAR ----------------");
		int i;
		for (i = 0; i < n; i++) {
		if ( planta[i].getQuantidadeComprar() <= 0 ) {
			continue;
		} else {
			System.out.printf("NOME: %s\n", planta[i].getNome());
			System.out.printf("QUANTIDADE: %d\n", planta[i].getQuantidadeComprar());
		}
		}
		
		System.out.println("--------------------------------------------------------");
	}
}
