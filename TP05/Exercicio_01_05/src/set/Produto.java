package set;

import java.util.Scanner;

public class Produto {
	private String nome;
	private int ID;
	private double preço;
	
	public static Scanner leitor = new Scanner(System.in);
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setID(int num) {
		this.ID = num;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setPreco(double num) {
		this.preço = num;
	}
	
	public double getPreco() {
		return this.preço;
	}
	
	public void exibirDados() {
		System.out.println("------------------------------------");
		System.out.println("NOME: " + this.nome);
		System.out.println("CODIGO DE BARRA: " + this.ID);
		System.out.println("PRECO: " + this.preço);
		System.out.println("------------------------------------");
	}
	
	public void lerProduto() {
		System.out.println("-----------DADOS DO PRODUTO------------");
		System.out.println("NOME: ");
		this.setNome(leitor.next());
		
		System.out.println("CODIGO DE BARRA: ");
		this.setID(leitor.nextInt());
		
		System.out.println("PRECO: ");
		this.setPreco(leitor.nextDouble());
		
		System.out.println("------------------------------------");
	}
}
