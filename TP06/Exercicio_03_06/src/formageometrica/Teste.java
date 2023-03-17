package formageometrica;

import java.util.Scanner;

public class Teste {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Mesa mesa = new Mesa("triangulo");
		
		FormaGeometrica forma = mesa.getFormato();
		forma.exibirForma();
	}

}
