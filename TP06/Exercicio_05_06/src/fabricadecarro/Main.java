package fabricadecarro;

import java.util.Scanner;

public class Main {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
		
		System.out.println("Insira as informacoes do cliente: ");
		System.out.println("Nome: ");
		cliente.setNome(leitor.next());
		System.out.println("Carro\nSedan ou Popular: ");
		String tipoCarro = leitor.next();
		System.out.println("Modelo\nPopular: Palio, Fiesta\nSedan: Fiesta, Siena ");
		String modeloCarro = leitor.next();
		cliente.setCarro(tipoCarro, modeloCarro);
		
		cliente.getInformacoesCliente();
		
	}
}
