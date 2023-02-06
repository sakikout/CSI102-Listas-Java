package automoveis;

import java.util.HashMap;

public class Oficina {
	
	private HashMap<Integer, Veiculo> veiculos = new HashMap<Integer, Veiculo>();
	private Integer index = 0;
	
	public void adicionarVeiculo(Veiculo veiculo) {
		this.veiculos.put(index, veiculo);
		this.index ++;
	}
	
	public void removerVeiculos() {
		this.veiculos.clear();
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		for (Integer i : veiculos.keySet()) {
			  if (veiculos.get(i) == veiculo) {
				  this.veiculos.remove(i);
			  }
			}
	}
	
	public Veiculo proximo() {
		int sorte = (int)(Math.random() * this.veiculos.size());
		
		return veiculos.get(sorte);
		
		/*
		for (Integer i : veiculos.keySet()) {
			  if (i == sorte) {
				  System.out.println("O veiculo de " + veiculos.get(i).getDono() + "é do tipo " + veiculos.get(i).getTipo() + " e se encontra na oficina.");
			  }
			}
			*/
		
	}
	
	public void manutencao(Veiculo v) {
		System.out.println("--------AJUSTE-----------");
		System.out.println("DONO: " + v.getDono());
		v.ajustar();
		System.out.println("----------LIMPEZA--------");
		v.limpar();
		System.out.println("-------VERIFICACAO-------");
		v.listarVerificacoes();
		
		if (v instanceof Automovel) {
			((Automovel) v).mudarOleo(50);
		}
	}
}
