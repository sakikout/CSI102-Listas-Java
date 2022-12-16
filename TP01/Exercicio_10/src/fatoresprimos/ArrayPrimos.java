package fatoresprimos;

public class ArrayPrimos {
	
	private int tamanho_array;
	private int numero;
		
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private int setTamanhoArray(int num, int primo) {
			int primo_aux = primo, par = 2;
			int resultado = num / primo, resultado_par = num / par;
			int resultado_aux = resultado;
			int contador = 0;
		if (resultado == 1 || resultado_par == 1) {
			contador++;
			return  contador;
		} else {
			if(num % primo == 0 && primo % 2 != 0) {
				contador++;
			}
			while (primo % 2 == 0) {
				primo ++;
			}
			primo_aux = primo;
			return contador + setTamanhoArray(resultado_aux, primo_aux);
		}
		
	}
	
	public void setTamanho(int num) {
		this.tamanho_array = this.setTamanhoArray(num, 3);
	}
	
	public int getTamanho() {
		return this.tamanho_array;
	}
	
	
	public void setArrayPrimos(int num, int arr[], int tam) {
		int primo = 3, par = 2;
		int numero = num;
		int resultado = num / primo;
		int resultado_aux = resultado, resultado_par = resultado_aux / par;
		int i = 0;
		
		while(resultado != 1 || resultado_par != 1) {
			if(numero % primo == 0 && primo % 2 != 0) {
				arr[i] = primo;
				numero = resultado_aux;
				resultado = numero / primo;
				resultado_aux = resultado;
				resultado_par = resultado_aux / par;
				primo++;
		
				i++;
				if (i == tam) {
					break;
				}
			} else {
				primo++;
			}
		}
	}
			

	
	public int getNumeroArrayPrimos(int arr[], int index) {
		return arr[index];
	}
	
}
