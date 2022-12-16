package fatoresprimos;

import java.util.Scanner;

public class FatoresPrimos {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		ArrayPrimos num = new ArrayPrimos();
	
		System.out.println("Insira o número para a decomposição: ");
		num.setNumero(leitor.nextInt());
		num.setTamanho(num.getNumero());
		
		System.out.println("Tamanho do vetor: " + num.getTamanho());
		
		int[] vetor_primos = new int[num.getTamanho()];
		
		num.setArrayPrimos(num.getNumero(), vetor_primos, num.getTamanho());
		
		System.out.println("Vetor de numeros primos do numero " + num.getNumero() + ": ");
		
		for (int i = 0; i < num.getTamanho(); i++) {
			System.out.printf("%d ", vetor_primos[i]);
		}
		
	}
	
}
