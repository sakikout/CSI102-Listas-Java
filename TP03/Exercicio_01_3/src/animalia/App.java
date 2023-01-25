package animalia;

import java.util.Scanner;

public class App {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		String nome;
		double peso;
		String habitat;
		String raça;
		String resposta;
		
		System.out.println("Insira as informações do Animal");
		
		System.out.println("Nome: ");
		nome = leitor.next();
		System.out.println("Peso: ");
		peso = leitor.nextDouble();
		
		System.out.println("O animal possui um habitat? sim ou nao ");
		resposta = leitor.next();
		
		if (resposta.contentEquals("sim") || resposta.contentEquals("SIM") || resposta.contentEquals("Sim") ) {
			System.out.println("Insira o habitat: ");
			habitat = leitor.next();
			
			Peixe peixe = new Peixe(nome, peso, habitat);
			System.out.println(peixe.toString());
			
		} else if (resposta.contentEquals("nao") || resposta.contentEquals("NAO") || resposta.contentEquals("Nao") || resposta.contentEquals("não") || resposta.contentEquals("NÃO") || resposta.contentEquals("Não")) {
			System.out.println("O animal possui uma raça? sim ou nao");
			
			resposta = leitor.next();
			
			if (resposta.contentEquals("sim") || resposta.contentEquals("SIM") || resposta.contentEquals("Sim") ) {
				System.out.println("Insira a raça: ");
				raça = leitor.next();
				
				Cachorro cachorro = new Cachorro (nome, peso, raça);
				System.out.println(cachorro.toString());
				
			} else if (resposta.contentEquals("nao") || resposta.contentEquals("NAO") || resposta.contentEquals("Nao") || resposta.contentEquals("não") || resposta.contentEquals("NÃO") || resposta.contentEquals("Não")) {
				
				Animal animal = new Animal (nome, peso);
				System.out.println(animal.toString());
				
			}
		}
	}
}
