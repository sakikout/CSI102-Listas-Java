package somador;

import java.util.List;

public class AdapterSomador implements SomadorEsperado {
	private SomadorExistente somador = null;
	
	public AdapterSomador(SomadorExistente somador) {
		this.somador = somador;
	}

	@Override
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for(int i = 0; i < vetor.length; i++) {
			resultado += i;
		}
		return resultado;
	}
	
	public int somarLista(List<Integer> lista) {
		return this.somador.somaLista(lista);
	}
}
