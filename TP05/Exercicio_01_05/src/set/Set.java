package set;

import java.util.ArrayList;

public class Set {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<String> nomes = new ArrayList<String>();
	
	public void adicionarNome(String nome) {
		this.nomes.add(nome);
	}
	
	public void adicionarProduto(Produto prod) {
		int flag = 0;
		try {
			for (Produto i : this.produtos) {
				if (i.getID() == prod.getID()) {
					System.out.println("Produto já existe no conjunto.");
					flag = 1;
					break;
				} 
			}
			if (flag == 0) {
				this.produtos.add(prod);
				this.nomes.add(prod.getNome());
			}
			} catch (Exception e) {
				this.produtos.add(prod);
				this.nomes.add(prod.getNome());
				
				for (Produto j : this.produtos) {
					if (j != prod && j.getID() == prod.getID()) {
						System.out.println("Produto já existe no conjunto.");
						this.produtos.remove(prod);
						this.nomes.remove(prod.getNome());
						break;
					} 
				}
				
			} finally {
				System.out.println("Tentativa de adição finalizada.");
			}
	}
	
	public void removerNome(String nome) {
		try {
		for (String i : this.nomes) {
			if (i.equals(nome)) {
				this.nomes.remove(nome);
				System.out.println("Nome removido.");
			}
		}
		} catch (Exception e) {
			System.out.println("O nome não foi encontrado.");
		} finally {
			System.out.println("Tentativa de remoção finalizada.");
		}
	}
	
	public void verificarNome(String nome) {
		try {
			for (String i : this.nomes) {
				if (i.equals(nome)) {
					System.out.println("Nome existente no conjunto.");
				}
			}
			} catch (Exception e) {
				System.out.println("O nome não foi encontrado.");
			} finally {
				System.out.println("Tentativa de busca finalizada.");
			}
	}
	
	public void apagarNomes() {
		try {
			this.nomes.clear();
			System.out.println("Os nomes foram apagados.");
			} catch (Exception e) {
				System.out.println("Não foi posível esvaziar o conjunto.");
			} finally {
				System.out.println("Try catch finalizado.");
			}
	}
	
	public void exibirProdutos() {
		try {
			for (Produto i : this.produtos) {
				i.exibirDados();
			}
			} catch (Exception e) {
				System.out.println("Não foi possível exibir os dados dos produtos.");
			}
	}
}
