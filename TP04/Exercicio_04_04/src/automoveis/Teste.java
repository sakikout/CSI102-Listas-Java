package automoveis;

import java.util.Scanner;

public class Teste {
	
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		String nome, tipo;
		
		Oficina o = new Oficina();
		Veiculo[] veiculos = new Veiculo[5];
		Veiculo v;
		
		System.out.println("Insira o nome do dono e o tipo de automovel");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Dono: ");
			nome = leitor.next();
			
			System.out.println("Tipo (Automovel ou Bicicleta): ");
			tipo = leitor.next();
			
			tipo.toLowerCase();
			
			if (tipo.equals("bicicleta")) {
				veiculos[i] = new Bicicleta(nome);
				
			} else if (tipo.equals("automovel")) {
				veiculos[i] = new Automovel(nome);
			} else {
				System.out.println("Tipo indefinido! Será tratado como um Automovel.");
				veiculos[i] = new Automovel(nome);
			}
		}
		
		for(int i = 0; i < 5; ++i) {
			o.adicionarVeiculo(veiculos[i]);
			v = o.proximo();
			o.manutencao(v);
		}
	}
}
