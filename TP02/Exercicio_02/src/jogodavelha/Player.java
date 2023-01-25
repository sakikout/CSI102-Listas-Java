package jogodavelha;

import jogodavelha.JogoDaVelha.StatusPlace;

public class Player {
	
	private StatusPlace player;
	private int p;
	private int vitoria = 0;
	private int derrota = 0;
	private int empate = 0;
	
	public Player (int num) {
		switch(num) {
		case 1: this.player = StatusPlace.PLAYER_ONE;
				p = num;
		break;
		case 2: this.player = StatusPlace.PLAYER_TWO;
				p = num;
		break;
		default: System.out.println("Invalido.");
		}
	}
	
	public StatusPlace getJogador() {
		return this.player;
	}
	
	public void setVitoria(int num) {
		this.vitoria += num;
	}
	
	public void setDerrota(int num) {
		this.derrota += num;
	}
	
	public void setEmpate(int num) {
		this.empate += num;
	}
	
	public void resetPlacar() {
		this.vitoria = 0;
		this.derrota = 0;
		this.empate = 0;
	}
	
	public void checarPlacar() {
		System.out.printf("Placar JOGADOR %d\n", this.p);
		System.out.println("Vitorias: " + this.vitoria);
		System.out.println("Derrotas: " + this.derrota);
		System.out.println("Empates: " + this.empate);
	}
	
	public int getVitoria() {
		return this.vitoria;
	}
	
	public int getDerrota() {
		return this.derrota;
	}
	
	public int getEmpate() {
		return this.empate;
	}
}
