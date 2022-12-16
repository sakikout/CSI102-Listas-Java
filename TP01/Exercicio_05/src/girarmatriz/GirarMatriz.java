package girarmatriz;

import java.util.Scanner;

public class GirarMatriz {
	
	public static int[][] matriz = new int[3][3];
	public static int[][] matriz_nova = new int [3][3];
	static Scanner leitor = new Scanner (System.in);
	
	public static void main (String[] args) {
		int i, j;
		
		System.out.println("Insira os valores na Matriz");
		
		for (i = 0; i < 3; i ++) {
			for (j = 0; j < 3; j ++) {
				System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
				matriz[i][j] = leitor.nextInt();
			}
		}
		
		inverterMatriz(matriz, matriz_nova);
		
		System.out.println("Matriz Original:");
		mostrarMatriz(matriz);
		
		System.out.println("Matriz Rotacionada:");
		mostrarMatriz(matriz_nova);
	}
	
	public static void inverterMatriz (int m1[][], int m2[][]) {
		int i, j;
		for (i = 0; i < 3; i ++) {
			for (j = 0; j < 3; j ++) {
				m2[i][j] = m1[2 - j][i];
			}
		}
	}
	
	public static void mostrarMatriz (int m[][]) {
		int i, j;
		for (i = 0; i < 3; i ++) {
			for (j = 0; j < 3; j ++) {
				System.out.printf("%d\t", m[i][j]);
			}
			System.out.printf("\n");
		}
	}
	

}
