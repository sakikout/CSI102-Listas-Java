package mapa.funcionario;

import java.util.Scanner;

public class Main {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Mapa funcionarios = new Mapa();
		Funcionario[] funcionario = new Funcionario[5];
		String pesquisa;
		
		funcionario[0] = new Funcionario("Steve Jobs", "a1234");
		funcionario[1] = new Funcionario("Scott McNealy", "a1235");
		funcionario[2] = new Funcionario("Jeff Bezos", "a1236");
		funcionario[3] = new Funcionario("Larry Ellison", "a1237");
		funcionario[4] = new Funcionario("Bill Gates", "a1238");
		
		for(int i = 0; i < 5; i++) {
			funcionarios.adicionarFuncionario(funcionario[i]);
		}
		
		System.out.println("TABELA DE FUNCIONARIOS CADASTRADOS: ");
		funcionarios.mostrarInformacoes();
		
		System.out.println("Insira o ID de um funcionario para a pesquisa: ");
		pesquisa = leitor.next();
		
		System.out.println(funcionarios.getFuncionario(pesquisa));
	}
}
