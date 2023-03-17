package impressora;

import java.util.Scanner;

public class Main {
	private static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Insira a quantidade de impressoras: ");
		int quantidade = leitor.nextInt();
		
		ImpressoraSingleton[] impressora = new ImpressoraSingleton[quantidade];
		
		
		for(int i = 0; i < quantidade; i++) {
			impressora[i] = ImpressoraSingleton.getInstance();
		}
		System.out.println("------------ IMPRESSORAS DISPONIVEIS---------------");
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Impressora " + i + ":" + impressora[i]);
		}
		System.out.println("---------------------------------------------------");
		
		System.out.println("Insira o relatório para impressão: ");
		String resposta = leitor.next();
		
		impressora[0].imprimir(resposta);
	
	}
	
}
