package automovel;

import java.util.Scanner;

public class Locomotiva {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Automovel carro = new Automovel();
		int resposta;
		
		
		Automovel.criarCarro(carro);
		
		System.out.printf("Deseja ver as informações do veículo?\n1- SIM \n2- NAO\n");
		resposta = leitor.nextInt();
		
		if (resposta == 1) {
			Automovel.mostrarCarro(carro);
		} else {
			System.out.printf("Finalizando!");
		}
		
		
		
	}
	
}
