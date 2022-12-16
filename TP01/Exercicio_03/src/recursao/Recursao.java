package recursao;

import java.util.Scanner;

public class Recursao {
	
	public static int numero_sequencia;
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Insira o número para o calculo da sequência: ");
		numero_sequencia = leitor.nextInt();
		
		System.out.println(desRecursao(numero_sequencia));
		
		
	}
	
	public static int desRecursao(int num) {
		if ( num == 1) {
			return num;
			
		} else if (num == 2) {
			return num;
			
		} else {
			return 2 * desRecursao(num - 1) + 3 * desRecursao(num - 2);
		}
	}
	
}
