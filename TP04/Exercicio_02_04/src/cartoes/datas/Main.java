package cartoes.datas;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome, resposta;
		CartaoWeb[] cartoes = new CartaoWeb[3];
		
		System.out.println("Insira o nome do destinatário: ");
		nome = leitor.next();
		
		cartoes[0] = new Aniversario(nome);
		cartoes[1] = new Natal(nome);
		cartoes[2] = new DiaDosNamorados(nome);
		
		System.out.println("Insira o nome do cartão desejado: ");
		System.out.printf("1- Dia dos Namorados \n2- Natal \n3- Aniversário \n4- Todos\n");
		
		resposta = leitor.next();
		
		if (resposta.equals("dia dos namorados") || resposta.equals("Dia dos Namorados") || resposta.equals("DIA DOS NAMORADOS") || resposta.equals("Dia dos namorados") || resposta.equals("1") ) {
			cartoes[2].showMessage();
			
		} else if (resposta.equals("natal") || resposta.equals("Natal") || resposta.equals("NATAL") || resposta.equals("2")) {
			cartoes[1].showMessage();
			
		} else if (resposta.equals("aniversario") || resposta.equals("ANIVERSARIO") || resposta.equals("Aniversario") || resposta.equals("3")) {
			cartoes[0].showMessage();
			
		} else if (resposta.equals("Todos") || resposta.equals("todos") || resposta.equals("TODOS") || resposta.equals("4") ) {
			for ( CartaoWeb cart : cartoes) {
				cart.showMessage();
				System.out.println("--------------------------");
			}
		}
	}
}
