package comparable.comparator;

import java.util.Scanner;

public class Main {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Empregados firma = new Empregados();
		Numero arrayNumeros = new Numero();
		Funcionario[] funcionario = new Funcionario[5];
		Inteiro num = null;
		
		Menu(firma, funcionario, arrayNumeros, num);
		
		
	}
	
	public static void Menu(Empregados firma, Funcionario[] funcionarios, Numero array, Inteiro num) {
		int resposta, quantidade;
		System.out.println("Insira uma opção:");
		System.out.println("1- Numeros");
		System.out.println("2- Funcionarios");
		System.out.println("3- Sair");
		
		resposta = leitor.nextInt();
		
		switch(resposta) {
		case 1:  
			array.preencherArray();
			array.mostrarLista();
			array.ordenarLista();
		
			break;
		case 2:
			System.out.println("Insira a quantidade de funcionarios: ");
			quantidade = leitor.nextInt();
			
			funcionarioOperacao(firma, funcionarios, quantidade);
			break;
		case 3:
			System.out.println("Finalizado.");
			return;
		default:
			System.out.println("Invalido.");
			break;
		}
		
	}
	
	public static void funcionarioOperacao(Empregados firma, Funcionario[] funcionarios, int num) {
		Funcionario resp1, resp2;
		int i, resp;
		double sal;
		String nome, ID;
		int dia, mes, ano;
		
		for(i = 0; i < num; i++) {
			System.out.println("Insira as informações do funcionario:");
			System.out.println("Nome: ");
			nome = leitor.next();
			
			System.out.println("ID: ");
			ID = leitor.next();
			
			System.out.println("Salario: ");
			sal = leitor.nextDouble();
			
			System.out.println("Data de Emprego");
			System.out.println("Dia: ");
			dia = leitor.nextInt();
			
			System.out.println("Mes: ");
			mes = leitor.nextInt();
			
			System.out.println("Ano: ");
			ano = leitor.nextInt();
			
			funcionarios[i] = new Funcionario(ID, nome, sal, dia, mes, ano);
			firma.adicionarFuncionario(funcionarios[i]);
		}
		
		System.out.println(">>>>>OPERACOES DISPONIVEIS<<<<<<<");
		System.out.println("1 - Ordenar por salario");
		System.out.println("2 - Ordenar por ordem alfabetica");
		System.out.println("3 - Maior e menor salario");
		System.out.println("4 - Mais e menos experiente");
		System.out.println("5 - Sair");
		System.out.println("Resposta: ");
		resp = leitor.nextInt();
		
		switch(resp) {
		case 1: firma.ordenarSalario();
			break;
		case 2: firma.ordenarAlfabeto();
			break;
		case 3: 
			resp1 = firma.maiorSalario();
			resp2 = firma.menorSalario();
			
			System.out.println("Funcionario com maior salario: " + resp1.getNome());
			System.out.println("Funcionario com menor salario: " + resp2.getNome());
			break;
		case 4: 
			resp1 = firma.maisExperiente();
			resp2 = firma.menosExperiente();
		
			System.out.println("Funcionario mais experiente: " + resp1.getNome());
			System.out.println("Funcionario menos experiente: " + resp2.getNome());
			break;
		case 5:
			System.out.println("Finalizado.");
			return ;
		default: 
			System.out.println("Invalido.");
			break;
		
		}
	
	}
}
