package firma;

import java.util.Scanner;

public class App {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		Gerente gerente;
		Vendedor vendedor;
		Cliente cliente;
		
		String nome, sexo, matricula, nomeGerencia;
		int idade, quantidadeVendas, anonasc;
		double salario, valorVendas, valorDivida;
		
		System.out.println("Insira os dados do Gerente:  ");
		System.out.println("Nome: ");
		nome = leitor.next();
		
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Sexo: ");
		sexo = leitor.next();
		
		System.out.println("Salario: ");
		salario = leitor.nextDouble();
		
		System.out.println("Matricula: ");
		matricula = leitor.next();
		
		System.out.println("Nome da Gerencia: ");
		nomeGerencia = leitor.next();
		
		gerente = new Gerente(nome, idade, sexo, salario, matricula, nomeGerencia);
		
		System.out.println("Insira os dados do Vendedor:  ");
		System.out.println("Nome: ");
		nome = leitor.next();
		
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Sexo: ");
		sexo = leitor.next();
		
		System.out.println("Salario: ");
		salario = leitor.nextDouble();
		
		System.out.println("Matricula: ");
		matricula = leitor.next();
		
		System.out.println("Valor das Vendas: ");
		valorVendas = leitor.nextDouble();
		
		System.out.println("Quantidade das Vendas: ");
		quantidadeVendas = leitor.nextInt();
		
		vendedor = new Vendedor(nome, idade, sexo, salario, matricula, quantidadeVendas, valorVendas);
		
		System.out.println("Insira os dados do Cliente:  ");
		System.out.println("Nome: ");
		nome = leitor.next();
		
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Sexo: ");
		sexo = leitor.next();
		
		System.out.println("Valor da dívida: ");
		valorDivida = leitor.nextDouble();
		
		System.out.println("Ano de Nascimento: ");
		anonasc = leitor.nextInt();
		
		cliente = new Cliente(nome, idade, sexo, valorDivida, anonasc);
		
		gerente.toString();
		vendedor.toString();
		cliente.toString();
	}
	
}
