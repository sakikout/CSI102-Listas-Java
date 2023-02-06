package container;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		Out o = new Out();
		Form conteudo;
		Container container = new Container();
		String frase;
		int saida;
		
		System.out.println("Insira até 5 palavras: ");
		for (int i = 0; i < 5; i++) {
			frase = leitor.next();
			conteudo = new Form(frase);
			container.adicionar(conteudo, i);
		}
		
		System.out.println("Insira o tipo de saída");
		System.out.printf("1- Saída no console\n2- Saída em arquivo de texto");
		saida = leitor.nextInt();
		o.setSaida(saida);
		container.print(o);
		
	}

}
