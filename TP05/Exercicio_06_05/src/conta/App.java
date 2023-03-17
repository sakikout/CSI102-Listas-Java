package conta;

import java.util.Scanner;

public class App {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) throws ContaExcecao {
			Conta minhaConta = new Conta();
			int n = 1000;
			
			minhaConta.definirTitular("eu");
			minhaConta.setLimite(100);
			System.out.println("Limite da conta: " + minhaConta.getLimite());
			minhaConta.deposita(100);
			
			try{ 
				System.out.println("Tentativa de saque: " + n + " reais");
				minhaConta.saca(n);
			} catch (ContaExcecao e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("Ação finalizada.");
			}
	}
	
	public static void Menu(Conta conta) throws ContaExcecao {
		int resposta;
		System.out.println(">>>>>>>>>OPERACOES DISPONIVEIS<<<<<<<<<");
		System.out.println("1- Definir Titular");
		System.out.println("2- Definir Limite");
		System.out.println("3- Depositar");
		System.out.println("4- Sacar");
		System.out.println("5- Imprimir");
		System.out.println("6- Sair");
	do {	
		System.out.println("\nInsira uma opcao: ");
		 resposta = leitor.nextInt();
		
		switch(resposta) {
		case 1: 
			conta.definirTitular("eu");
			System.out.println("Titular definido como:  " + conta.getTitular());
			break;
		case 2: 
			conta.setLimite(1000);
			System.out.println("Limite definido como: " + conta.getLimite());
			break;
		case 3: 
			try{ 
				conta.deposita(100);
			} catch (ContaExcecao e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4: 
			try{ 
				conta.saca(150);
			} catch (ContaExcecao e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5: 
			conta.informacoesConta();
			break;
		case 6:  System.out.println("Finalizado.");
				return;
		default: 
			System.out.println("Insira uma opção VÁLIDA.");
			break;
		}
	
	} while (resposta != 6);
}
}