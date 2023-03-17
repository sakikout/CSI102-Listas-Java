package somethods;

import java.util.Scanner;

import testeexcecao.NovaExcecao;

public class Main {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		int[] arr = new int [6];
		
		System.out.println("Insira 6 numeros menores que 5 no vetor");
		System.out.println("Digite -1 para parar.");
		
		try {
			someMethod(arr, 6, 5);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return;
		}
		System.out.println("Vetor: ");
		
		for (int i = 0; i < 5; i++) {
			if(arr[i] == -1) {
				i++;
				continue;
			}
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void someMethod(int[] arr, int tam, int limit)  throws Exception{
		int i = 0;
		int [] num = new int[tam];
		do {
			num[i] = leitor.nextInt();
			//System.out.println(num[i]);
			arr[i] = num[i];
			if (  num[i] == -1) {
				break;
			}
			i++;
		} while (num[i] < limit || i < arr.length);
		
		someMethod2( arr, tam, limit);
}
	
	private static void someMethod2(int[] arr, int tam, int limit)  throws Exception{
		int index;
		 if ( arr.length > tam) {
				throw new  ArrayIndexOutOfBoundsException();
			} else {
				for( index = 0; index < arr.length; index++) {
					if (arr[index] > limit) {
						throw new NovaExcecao("Numero " + arr[index] +" fora do limite do vetor");
					} else {
						continue;
					}
				}
			}
	}
}
