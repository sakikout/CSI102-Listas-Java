package lanchonetefactory;

import java.util.Scanner;

public class Teste {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Fabricar fabrica = new Fabricar();
		SanduichesIngredientFactory lanchonete;
		Sanduiche pedido;
		Menu();
		int resposta = leitor.nextInt();
		
		switch(resposta) {
		case 1: 
			lanchonete = fabrica.criarFabricaCG();
			pedido = ((SanduichesIngredientFactoryCG) lanchonete).criarSanduicheCG();
			pedido.mostrarPedido();
			
			break;
		case 2:
			lanchonete = fabrica.criarFabricaJP();
			pedido = ((SanduichesIngredientFactoryJP) lanchonete).criarSanduicheJP();
			pedido.mostrarPedido();
			
			break;
		case 3: 
			lanchonete = fabrica.criarFabricaRT();
			pedido = ((FabricadeSanduichesRT) lanchonete).criarSanduicheRT();
			pedido.mostrarPedido();
			
			break;
		default:
			
			break;
		}
	}
	
	public static void Menu() {
		System.out.println("------------LANCHONETES DISPONIVEIS--------------");
		System.out.println("1- Lanchonete CG");
		System.out.println("2- Lanchonete JP");
		System.out.println("3- Lanchonete RT");
		System.out.println("\nINSIRA A OPÇÃO:");
	}

}
