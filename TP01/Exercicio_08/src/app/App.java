package app;

import java.util.Scanner;

public class App {
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		IntegerSet array1 = new IntegerSet();
		IntegerSet array2 = new IntegerSet();
		IntegerSet array3 = new IntegerSet();
		
		
		array1.criarObjeto();
		int[] vetor1 = new int[array1.getTam()];
		boolean[] vt1 = new boolean[array1.getTam()];
		array1.preencherArray(vetor1, vt1);
		array1.mostrarArray(vetor1);
		
		array2.criarObjeto();
		int[] vetor2 = new int[array2.getTam()];
		boolean[] vt2 = new boolean[array2.getTam()];
		array2.preencherArray(vetor2, vt2);
		array2.mostrarArray(vetor2);
		
		menuApp(array1, array2, array3, vetor1, vetor2, vt1, vt2);
		
	}

	public static void menuApp (IntegerSet a1, IntegerSet a2, IntegerSet a3, int vet1[], int vet2[], boolean vt1[], boolean vt2[]) {
		int resposta;
		int vetor, index;
		System.out.printf("MENU DE OPERAÇÕES ENTRE VETORES\n1- Diferença \n2- União \n3- Interseção \n4- Remover Elemento \n5-Remover Elementos Fora do Conjunto \n6-Sair\n");
		System.out.println("Insira o numero da operação desejada: ");
		
		resposta = leitor.nextInt();
		
		switch (resposta) {
			case 1: int[] vt3 = new int [a2.getTam()];
						a3.differArrs(a1, a2, vet1, vet2, vt3);
						System.out.println("Diferença entre Vetor 1 e Vetor 2: ");
						a3.mostrarArray(vt3);
				break;
			case 2: int[] vetor3 = new int [a1.getTam() + a2.getTam()];
					a3.uniteArrs(a1, a2, vet1, vet2, vetor3, vt1);
					System.out.println("União entre Vetor 1 e Vetor 2: ");
					a3.mostrarArray(vetor3);
				break;
			case 3: int[] vet3 = new int [a2.getTam()];
					a3.intersecArrs(a1, a2, vet1, vet2, vet3, vt1, vt2);
					System.out.println("Interseção entre Vetor 1 e Vetor 2: ");
					a3.mostrarArray(vet3);
				break;
			case 4: System.out.println("Insira o numero do vetor (1 ou 2): ");
					vetor = leitor.nextInt();
					System.out.println("Insira o índice do elemento: ");
					index = leitor.nextInt();
					if (vetor == 1) {
						a1.removeElements(index, a1.getTam(), vet1, vt1);
						a1.mostrarArray(vet1);
					} else if (vetor == 2) {
						a2.removeElements(index, a2.getTam(), vet2, vt2);
						a2.mostrarArray(vet2);
					}
				break;
			case 5:	System.out.println("Insira o numero do vetor (1 ou 2): ");
					vetor = leitor.nextInt();
					if (vetor == 1) {
						a1.removeFalseElements(a1.getTam(), vet1, vt1);
						a1.mostrarArray(vet1);
					} else if (vetor == 2) {
						a2.removeFalseElements(a2.getTam(), vet2, vt2);
						a2.mostrarArray(vet2);
					}
				break;
			case 6:	System.out.println("Finalizado.");
				break;
			default: System.out.println("Invalido.");
				break;
					
		}
		
	}
	
}
