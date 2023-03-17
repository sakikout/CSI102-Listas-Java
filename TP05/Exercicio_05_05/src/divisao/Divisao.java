package divisao;

import java.util.Scanner;

public class Divisao {
	private static boolean RuntimeException = false;
	public static Scanner teclado = new Scanner (System.in);
	
	public static void main (String[] args) throws Exception {
		System.out.println("Eu sei dividir!");
		int x, y;
		double resultado;
		
		do{
			System.out.println("Informe o primeiro valor: ");
			x = teclado.nextInt();
			
			System.out.println("Informe o segundo valor: ");
			y = teclado.nextInt();
			
			resultado = ((double)x / y);
			dividirNumero(x, y, resultado);
			
		}
		while(RuntimeException == true);
		
		System.out.printf("O resultado é: %3f\n", resultado);
		
	}
	
	
	public static void dividirNumero(int x, int y, double resultado) throws Exception {
		try {
			resultado = (double)(x / y);
			RuntimeException = false;
			
		} catch (ArithmeticException e ) {
			System.out.println(e.getMessage());
			System.out.println("Insira valores válidos para a operação. ");
			RuntimeException = true;
			return;
		} finally {
			System.out.println("Fim da tentativa de divisão.\n");
		}
	
	}
}
