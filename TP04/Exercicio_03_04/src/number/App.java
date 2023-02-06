package number;

import java.util.HashMap;
import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		HashMap<String, Number> numeros = new HashMap<String, Number>();
		Number[] numero = new Number[5];
		int valor;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira 5 valores numéricos: ");
		
		for(int i = 0; i < 5; i++) {
			valor = leitor.nextInt();
			numero[i] = new Number();
			numero[i].setValue(valor);
			
			numeros.put(numero[i].toString(), numero[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(numero[i].equals(numero[j]) || numero[i].hashCode() == numero[j].hashCode()) {
					System.out.printf("Os numeros %d e %d são iguais! ", numeros.get(numero[i].toString()),numeros.get(numero[j].toString()) );
				}
			}
			
		}
	}
}
