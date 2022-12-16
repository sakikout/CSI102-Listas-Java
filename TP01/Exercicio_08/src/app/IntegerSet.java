package app;

import java.util.Scanner;

public class IntegerSet {
	
	public static Scanner leitor = new Scanner(System.in);
	private int min;
	private int max;
	private int tam;
	
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setTam(int tam) {
		this.tam = tam;
	}
	
	public int getTam() {
		return this.tam;
	}

	
	public void criarObjeto() {

		System.out.println("Insira o tamanho do vetor: ");
		this.tam = leitor.nextInt();
		System.out.println("Insira o valor máximo do vetor: ");
		this.max = leitor.nextInt();
		
	}
	
	public void preencherArray(int vetor[], boolean vet[]) {

		for (int i = 0; i < this.tam; i ++) {
			System.out.printf("Insira o elemento %d do vetor: ", i + 1);
			vetor[i] = leitor.nextInt();
			this.setArrBool(vetor[i], i, vet);
		}
		
	}
	
	public void mostrarArray(int vetor[]) {
		System.out.println("Elementos do vetor: ");
		for (int i = 0; i < this.tam; i ++) {
			System.out.printf("[%d]: %d\n", i + 1, vetor[i]);
		}
	}
	
	public void setArrBool(int x, int i, boolean vet[]) {
			if (x < this.min || x > this.max) {
				vet[i] = false;
			} else {
				vet[i] = true;
			}
		
		
	}
	
	public void removeElements(int x, int tam, int vetor[], boolean[] vet) {
		int i;
		for (i = 0; i < tam; i++) {
			if ( i == x ) {
				vetor[i] = vetor[i + 1];
				i++;
				tam--;
				this.tam = tam;
			} else {
				continue;
			}
		}
		for (i = 0; i < tam; i++) {
			this.setArrBool(vetor[i], i, vet);
		}
		
		
	}
	
	public void removeFalseElements(int tam, int vetor[], boolean vet[]) {
		int i;
		for (i = 0; i < tam; i++) {
			if ( vet[i] == false ) {
				vetor[i] = vetor[i + 1];
				i++;
				tam--;
				this.tam = tam;
			} else {
				continue;
			}
		}
		
		
	}
	
	public void uniteArrs(IntegerSet c1, IntegerSet c2, int vetor[], int vetor2[], int vetor3[], boolean vet[]) {
		int tam = c1.tam + c2.tam;
		int i, max = 0;
		
		for(i = 0; i < tam; i++) {
			if (vet[i] = false ) {
				vetor3[i] = vetor2[i];
			} else {
				vetor3[i] = vetor[i];
			}
			
			if(vetor3[i] > max) {
				max = vetor3[i];
			}
		}
		
		this.tam = tam;
		this.max = max;
	}
	
	public void intersecArrs(IntegerSet c1, IntegerSet c2, int vetor[], int vetor2[], int vetor3[], boolean vt1[], boolean vt2[]) {
		int i, max = 0, tam = c2.tam;
		
		if (c1.max > c2.max) {
			max = c2.max;
		} else {
			max = c1.max;
		}
		
		for(i = 0; i < c2.tam; i++) {
			if (vt1[i] = true && vetor[i] <= max ) {
				vetor3[i] = vetor[i];
			} else if ( vt1[i] = false) {
				if (vt2[i] = true && vetor2[i] <= max ) {
					vetor3[i] = vetor2[i];
				}
			}
		}
		this.tam = tam;
		this.max = max;
	}
	
	public void differArrs(IntegerSet c1, IntegerSet c2, int vetor[], int vetor2[], int vetor3[]) {
		int i, max = 0, tam = c2.tam;
		
		if (c1.max > c2.max) {
			max = c1.max;
		} else {
			max = c2.max;
		}
		
		for(i = 0; i < c2.tam; i++) {
			if (vetor[i] > vetor2[i] ) {
				vetor3[i] = vetor[i] - vetor2[i];
			} else {
				vetor3[i] = vetor2[i] - vetor[i];
				}
			}
		this.tam = tam;
		this.max = max;
		
	}
}
