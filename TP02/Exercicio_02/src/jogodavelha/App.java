package jogodavelha;

import java.util.Scanner;

public class App {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Player player_one = new Player(1);
		Player player_two = new Player(2);
		JogoDaVelha grade = new JogoDaVelha();
		String resposta, resposta_reiniciar;
		
		
		grade.iniciarInformacoes();
		grade.iniciarJogo(player_one, player_two);
		
		do {	System.out.println("Deseja jogar novamente? SIM ou NAO");
				resposta = leitor.next();
				System.out.println("Deseja reiniciar o placar? SIM ou NAO");
				resposta_reiniciar = leitor.next();
				
				if(resposta_reiniciar.contentEquals("sim") || resposta_reiniciar.contentEquals("SIM") || resposta_reiniciar.contentEquals("Sim")) {
					
					grade.reiniciarJogo(player_one, player_two);
					
				} else if (resposta_reiniciar.contentEquals("nao") || resposta_reiniciar.contentEquals("NAO") || resposta_reiniciar.contentEquals("Nao") || resposta_reiniciar.contentEquals("não") || resposta_reiniciar.contentEquals("NÃO") || resposta_reiniciar.contentEquals("Não")) {
					
					grade.iniciarJogo(player_one, player_two);
				}
			
		} while (resposta.contentEquals("sim") || resposta.contentEquals("SIM") || resposta.contentEquals("Sim"));
		
	}
}
