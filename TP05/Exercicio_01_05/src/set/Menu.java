package set;

import java.util.Scanner;
import java.io.IOException;

public class Menu {
	private Set set;
	
	public static Scanner leitor = new Scanner(System.in);
	
	public Menu (Set s) {
		this.set = s;
	}
	
	public void clearConsole() throws IOException, InterruptedException {
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}
	
	 public static void pause() {
	        leitor.next();
	    }
	
	private void mensagemMenu() throws IOException, InterruptedException {
		this.clearConsole();
		
		System.out.println("--------------MENU---------------");
		System.out.println("INSIRA O NUMERO DA OPERACAO");
		System.out.println("1 - Adicionar Produto");
		System.out.println("2 - Adicionar Nome");
		System.out.println("3 - Remover Nome");
		System.out.println("4 - Verificar Nome");
		System.out.println("5 - Apagar Nomes");
		System.out.println("6 - Exibir Produtos");
		System.out.println("7 - Sair");
		System.out.println("----------------------------------");
	}
	
	
	public void exibirMenu() throws IOException, InterruptedException {
		Produto prod = new Produto();
		int opcoes = 0;
		String nome;
		
		do {
			
		this.mensagemMenu();
		System.out.println("Digite uma opção: ");
		opcoes = leitor.nextInt();
		
		switch(opcoes) {
		case 1: 
			prod.lerProduto();
			this.set.adicionarProduto(prod);
			pause();
			break;
		case 2:	 
			System.out.println("Insira o nome para adição: ");
			nome = leitor.next();
			this.set.adicionarNome(nome);
			pause();
			break;
		case 3:
			System.out.println("Insira o nome para remoção: ");
			nome = leitor.next();
			this.set.removerNome(nome);
			pause();
			break;
		case 4:
			System.out.println("Insira o nome para verficação: ");
			nome = leitor.next();
			this.set.verificarNome(nome);
			pause();
			break;
		case 5:
			this.set.apagarNomes();
			pause();
			break;
		case 6:
			this.set.exibirProdutos();
			pause();
			break;
		case 7:
			this.clearConsole();
			System.out.println("---------- SAINDO DO MÓDULO ------------");
			pause();
			
			break;
		default: 
			this.clearConsole();
			System.out.println("INSIRA UMA OPÇÃO VÁLIDA!");
			pause();
				break;
		
		} } while (opcoes != 7);
	
	}
}
