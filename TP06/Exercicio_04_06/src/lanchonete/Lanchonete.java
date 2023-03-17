package lanchonete;

import java.util.Scanner;

public class Lanchonete {
	public static Scanner leitor = new Scanner(System.in);
	
	private String pao;
	private FormaGeometrica formaPao;
	private String queijo;
	private String presunto;
	private boolean salada;
	
	public void escolherPao(String tipo, String forma) {
		if (!tipo.equalsIgnoreCase("integral") || !tipo.equalsIgnoreCase("bola")|| !tipo.equalsIgnoreCase("frances") ) {
			this.pao = null;
			System.out.println("Tipo inválido.");
		} else {
			this.pao = tipo;
		}
		
		this.formaPao = FormaGeometricaFactory.criarForma(forma);
		this.formaPao.desenhar();
	}
	
	public void escolherQueijo(String queijin) {
		if (!queijin.equalsIgnoreCase("prato") || !queijin.equalsIgnoreCase("mussarela")|| !queijin.equalsIgnoreCase("cheddar") ) {
			this.queijo = null;
			System.out.println("Tipo inválido.");
		} else {
			this.queijo = queijin;
		}
	
	}
	
	public void escolherPresunto(String carne) {
		if (!carne.equalsIgnoreCase("peru") || !carne.equalsIgnoreCase("frango") ) {
			this.presunto = null;
			System.out.println("Tipo inválido.");
		} else {
			this.presunto = carne;
		}
	}
	
	public void temSalada(String resposta) {
		if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s") ) {
			this.salada = true;
			
		} else if (resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("n")) {
			this.salada = false;
		} else {
			System.out.println("Resposta inválida.");
		}
	}
	
	public void mostrarPedido() {
		System.out.println("------------ PEDIDO ---------------");
		System.out.println("Pão: " + this.pao + ", " + this.formaPao);
		System.out.println("Quejo: " + this.queijo);
		System.out.println("Presunto: " + this.presunto);
		
		if (this.salada == true) {
			System.out.println("Salada: com Verdura");
		} else {
			System.out.println("Salada: sem Verdura");
		}
		
		System.out.println("-----------------------------------");
		
	}
	
	public void montarSanduiche() {
		System.out.println("PAO:");
		String respostaPao = leitor.next();
		System.out.println("FORMA DO PAO:");
		String respostaForma = leitor.next();
		this.escolherPao(respostaPao, respostaForma);
		
		System.out.println("QUEIJO:");
		String respostaQueijo = leitor.next();
		this.escolherQueijo(respostaQueijo);
		
		System.out.println("PRESUNTO:");
		String respostaCarne = leitor.next();
		this.escolherPresunto(respostaCarne);
		
		System.out.println("SALADA:");
		String respostaSalada = leitor.next();
		this.temSalada(respostaSalada);
		
	}
}

