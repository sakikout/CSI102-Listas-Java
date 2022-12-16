package app;

import java.util.Scanner;

public class App {

	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Invoice fatura = new Invoice();
		int numero_serie;
		int quantidade_produto;
		float preco_produto;
		String desc_produto;
		
		System.out.println("Insira as informações para gerar a fatura");
		
		System.out.println("Numero de serie do produto: ");
		numero_serie = leitor.nextInt();
		fatura.setNumero(numero_serie);
		
		System.out.println("Quantidade do produto: ");
		quantidade_produto = leitor.nextInt();
		fatura.setQuantidade(quantidade_produto);
		
		System.out.println("Preço do produto: ");
		preco_produto = leitor.nextFloat();
		fatura.setPreco(preco_produto);
		
		System.out.println("Descrição do produto: ");
		desc_produto = leitor.next();
		fatura.setDesc(desc_produto);
		
		//getInvoiceAmount(quantidade_produto, preco_produto);
		
		mostrarFatura(fatura);
	}
	
	public static void mostrarFatura(Invoice fatura) {
		System.out.println("-------------------- FATURA ----------------------");
		System.out.println("NUMERO DE SERIE:  " + fatura.getNumero());
		System.out.println("DESCRICAO DO PRODUTO:  " + fatura.getDesc());
		System.out.println("PREÇO DO PRODUTO:  " + fatura.getPreco());
		System.out.println("QUANTIDADE DO PRODUTO:  " + fatura.getQuantidade());
		System.out.println("TOTAL: " + fatura.getInvoiceAmount(fatura.getQuantidade(), fatura.getPreco()));
		System.out.println("--------------------------------------------------");
		
	}
}
