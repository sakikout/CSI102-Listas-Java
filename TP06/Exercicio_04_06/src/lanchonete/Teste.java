package lanchonete;

import java.util.Scanner;

public class Teste {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Lanchonete nova = new Lanchonete();
		
		Menu();
		nova.montarSanduiche();
		nova.mostrarPedido();
	}
	
	public static void Menu() {
		System.out.println("------------OPCOES DISPONIVEIS--------------");
		System.out.println("PAO: Frances, Integral e Bola");
		System.out.println("QUEIJO: Prato, Mussarela, Cheddar");
		System.out.println("PRESUNTO: Frango, Peru");
		System.out.println("SALADA: Sim ou Nao");
		System.out.println("\nINSIRA O PEDIDO:");
	}

}
