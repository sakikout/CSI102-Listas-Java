package testeexcecao;

import java.util.Scanner;

public class TesteExcecao {
	public static Scanner leitor = new Scanner(System.in);
	
		public static void main (String[] args) {
			int idade;
			System.out.println("Insira sua idade: ");
			idade = leitor.nextInt();
			testaIdade(idade);
			
		}
		
		private static void pegaExcecao(int idade) throws Exception {
			if (idade < 18) {
				throw new NovaExcecao("Menores de idades não são permitidos");
			} else {
				return;
			}
				
	}
		
		public static void testaIdade(int idade) {
			try {
				pegaExcecao(idade);
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			System.out.println("Usuário permitido.");
		}
}
