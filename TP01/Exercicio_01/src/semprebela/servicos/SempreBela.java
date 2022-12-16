package semprebela.servicos;

import java.util.Scanner;

public class SempreBela {

	static Scanner leitor = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[5];
		
		for(int i = 0; i < 5; i++) {
			pessoas[i] = new Pessoa();
		}
		
		lerDados(pessoas, leitor, 5);
		mostrarDados(pessoas);
		
	}
	
	
	public static void lerDados(Pessoa pessoas[], Scanner leitor, int fun){
		System.out.printf("Insira o nome das %d manicures:", fun);
		int i;
		String nome;
		for(i = 0; i < fun; i++) {
			
			System.out.printf("\nNome da Manicure %d: ", i + 1);
			nome = leitor.next();
			pessoas[i].setNome(nome);
			
			System.out.printf("Servicos:\nManicure: ");
			pessoas[i].setManicure(leitor.nextInt());
			
			System.out.printf("Pedicure: ");
			pessoas[i].setPedicure(leitor.nextInt());
			
			System.out.printf("Podologia: ");
			pessoas[i].setPodologia(leitor.nextInt());
			
			pessoas[i].setSalario();
			
		}
	}
	
	public static void mostrarDados(Pessoa pessoa[]) {
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("--------------- DADOS ----------------");
			System.out.printf("NOME: %s\n", pessoa[i].getNome());
			System.out.printf("MANICURES: %d\n", pessoa[i].getManicure());
			System.out.printf("PEDICURES: %d\n", pessoa[i].getPedicure());
			System.out.printf("PODOLOGIAS: %d\n", pessoa[i].getPodologia());
			System.out.printf("SALARIO: R$ %d\n", pessoa[i].getSalario());
			System.out.println("--------------------------------------");
		}
	}
}
