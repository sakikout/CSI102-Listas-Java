package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
	
	public enum StatusPlace {
		EMPTY,
		PLAYER_ONE,
		PLAYER_TWO
	}
	
	private StatusPlace[][] grade = new StatusPlace[3][3];
	private StatusPlace vazio = StatusPlace.EMPTY;
	public static Scanner leitor = new Scanner(System.in);
	
	public JogoDaVelha() {
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				this.grade[i][j] = vazio;
			}
		}
	}
	
	public void iniciarInformacoes() {
		System.out.println("O jogo da Velha foi iniciado!");
		System.out.println("Para movimentar o jogador, é necessário informar as coordenadas da casa.");
		System.out.println("A casa PRECISA estar vazia para se movimentar!");
		System.out.println("O jogador que sempre irá começar o jogo é o Jogador 1.");
		System.out.printf("\n");
	}
	
	public void iniciarJogo(Player one, Player two) {
		int resultado;
		
		this.reiniciarGrade();
		this.mostrarGrade();
		
		// JOGADA 1
		this.movimentarJogador(one);
		this.mostrarGrade();
		
		this.movimentarJogador(two);
		this.mostrarGrade();
		
		this.movimentarJogador(one);
		this.mostrarGrade();
		
		// JOGADA 2
		this.movimentarJogador(two);
		this.mostrarGrade();
		
		this.movimentarJogador(one);
		this.mostrarGrade();
		
		resultado = this.placarMetade();
		
		if (resultado == 0) {
			
			this.movimentarJogador(two);
			this.mostrarGrade();
					
			// JOGADA 3
			this.movimentarJogador(one);
			this.mostrarGrade();
					
			this.movimentarJogador(two);
			this.mostrarGrade();
			
			this.movimentarJogador(one);
			this.mostrarGrade();
			
			//FINAL
			this.checarPlacar(one, two);
			one.checarPlacar();
			two.checarPlacar();
			
		} else {
			
			//FINAL
			this.checarPlacar(one, two);
			one.checarPlacar();
			two.checarPlacar();
		}
	
				
	}
	
	public void mostrarGrade() {
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(this.grade[i][j] + " ");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	private void reiniciarGrade() {
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				this.grade[i][j] = vazio;
			}
		}
	}
	


	public void reiniciarJogo(Player one, Player two) {
		this.reiniciarGrade();
		one.resetPlacar();
		two.resetPlacar();
	}
	
	
	private void movimentar(int i, int j, Player player) {
		if(this.grade[i][j] == vazio) {
			this.grade[i][j] = player.getJogador();
		} else {
			System.out.println("Você não pode escolher essa casa!\n");
			this.movimentarJogador(player);
		}
	}
	
	public void movimentarJogador(Player player) {
		int x, y;
		System.out.println( player.getJogador() + " insira as coordenadas para movimentar");
		System.out.printf("X (0, 1 ou 2): ");
		x = leitor.nextInt();
		System.out.printf("Y (0, 1 ou 2): ");
		y = leitor.nextInt();
		
		this.movimentar(x, y, player);
	}
	
	public void checarPlacar(Player player1, Player player2) {
		//StatusPlace p1 = StatusPlace.PLAYER_ONE;
		//StatusPlace p2 = StatusPlace.PLAYER_TWO;
		if (this.grade[0][0] == player1.getJogador() && this.grade[0][1] == player1.getJogador() && this.grade[0][2] == player1.getJogador()) {
			player1.setVitoria(1);
			player2.setDerrota(1);
			
			System.out.println("O jogador 1 venceu!");
			
		} else if (this.grade[1][0] == player1.getJogador() && this.grade[1][1] == player1.getJogador() && this.grade[1][2] == player1.getJogador()) {
			player1.setVitoria(1);
			player2.setDerrota(1);
			
			System.out.println("O jogador 1 venceu!");
			
		} else if (this.grade[2][0] == player1.getJogador() && this.grade[2][1] == player1.getJogador() && this.grade[2][2] == player1.getJogador()) {
			player1.setVitoria(1);
			player2.setDerrota(1);
			
			System.out.println("O jogador 1 venceu!");
			
		} else if (this.grade[0][0] == player1.getJogador() && this.grade[1][1] == player1.getJogador() && this.grade[0][0] == player1.getJogador()) {
			player1.setVitoria(1);
			player2.setDerrota(1);
			
			System.out.println("O jogador 1 venceu!");
			
		} else if (this.grade[0][0] == player2.getJogador() && this.grade[0][1] == player2.getJogador() && this.grade[0][2] == player2.getJogador()) {
			player2.setVitoria(1);
			player1.setDerrota(1);
			
			System.out.println("O jogador 2 venceu!");
			
		} else if (this.grade[1][0] == player2.getJogador() && this.grade[1][1] == player2.getJogador() && this.grade[1][2] == player2.getJogador()) {
			player2.setVitoria(1);
			player1.setDerrota(1);
			
			System.out.println("O jogador 2 venceu!");
			
		} else if (this.grade[2][0] == player2.getJogador() && this.grade[2][1] == player2.getJogador() && this.grade[2][2] == player2.getJogador()) {
			player2.setVitoria(1);
			player1.setDerrota(1);
			
			System.out.println("O jogador 2 venceu!");
			
		} else if (this.grade[0][0] == player2.getJogador() && this.grade[1][1] == player2.getJogador() && this.grade[0][0] == player2.getJogador()) {
			player2.setVitoria(1);
			player1.setDerrota(1);
			
			System.out.println("O jogador 2 venceu!");
			
		}else {
			player1.setEmpate(1);
			player2.setEmpate(1);
			
			System.out.println("Empate!");
		}
			
	}
	
	private int placarMetade() {
		StatusPlace p1 = StatusPlace.PLAYER_ONE;
		StatusPlace p2 = StatusPlace.PLAYER_TWO;
		if (this.grade[0][0] == p1 && this.grade[0][1] == p1 && this.grade[0][2] == p1) {
			
			return 1;
			
		} else if (this.grade[1][0] == p1 && this.grade[1][1] == p1 && this.grade[1][2] == p1) {
		
			
			return 1;
			
		} else if (this.grade[2][0] == p1 && this.grade[2][1] == p1 && this.grade[2][2] == p1) {
			
			
			return 1;
			
		} else if (this.grade[0][0] == p1 && this.grade[1][1] == p1 && this.grade[0][0] == p1) {
			
			
			return 1;
			
		} else if (this.grade[0][0] == p2 && this.grade[0][1] == p2 && this.grade[0][2] == p2) {
			
			
			return 2;
			
		} else if (this.grade[1][0] == p2 && this.grade[1][1] == p2 && this.grade[1][2] == p2) {
			
			
			return 2;
			
		} else if (this.grade[2][0] == p2 && this.grade[2][1] == p2 && this.grade[2][2] == p2) {
		
			
			return 2;
			
		} else if (this.grade[0][0] == p2 && this.grade[1][1] == p2 && this.grade[0][0] == p2) {
			
			
			return 2;
			
		}else {
			
			
			return 0;
		}
			
	}
}
