package comparable.comparator;

import java.util.ArrayList;

public class Numero implements Comparator{
	private ArrayList<Inteiro> numeros = new ArrayList<Inteiro>();
	
	public void adicionarInteiro(int num) {
		Inteiro numero = new Inteiro(num);
		
		if(num < 0 || num > 99) {
			System.out.println("Numero não pertence ao intervalo.");
		} else {
			numeros.add(numero);
		}
	}
	
	public void preencherArray() {
		int num;
		for (int i = 0; i < 50; i++) {
			num = (int)(Math.random() * 99 + 1);
			this.adicionarInteiro(num);
	}
	}
	
	public int tamanhoVetor() {
		return this.numeros.size();
	}
	
	public void limparLista() {
		this.numeros.clear();
	}
	
	public void mostrarLista() {
		for (Inteiro num : this.numeros) {
			System.out.printf("%d ", num.getNum());
		}
	}

	@Override
	public int maiorNumero() {
		int maiorNum = 0;
		for (Inteiro num : this.numeros) {
			if (num.getNum() > maiorNum) {
				maiorNum = num.getNum();
			}
		}
		return maiorNum;
	}
	
	@Override
	public int menorNumero() {
		int menorNum = 99;
		for (Inteiro num : this.numeros) {
			if (num.getNum() < menorNum) {
				menorNum = num.getNum();
			}
		}
		return menorNum;
	}

	@Override
	public int contadorMenor() {
		int menorNum, contador = 0;
		menorNum = this.menorNumero();
		for (Inteiro num : this.numeros) {
			if (num.getNum() == menorNum) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public void ordenarLista() {
		int[] vetorAux = new int[this.tamanhoVetor()];
		int i = 0;
		int j = 0;
		int auxTemp = vetorAux[i];
		int auxTroca; 
		int auxPosition = j;
		for (Inteiro num : this.numeros) {
			vetorAux[i] = num.getNum();
			i++;
		}
		
		for(i = 0; i < this.tamanhoVetor(); i++) {
			for (j = 0; j < this.tamanhoVetor(); j++) {
				if (vetorAux[i] < vetorAux[j]) {
					auxTemp = vetorAux[i];
					auxPosition = i;
				} else {
					auxTemp = vetorAux[j];
					auxPosition = j;
				}
			}
			auxTroca = vetorAux[i];
			vetorAux[i] = auxTemp;
			vetorAux[auxPosition] = auxTroca;
		}
		
		this.limparLista();
		
		for(i = 0; i < this.tamanhoVetor(); i++) {
			this.adicionarInteiro(vetorAux[i]);
		}
		
		System.out.println("\nLista ordenada.");
		this.mostrarLista();
	}
	
}
