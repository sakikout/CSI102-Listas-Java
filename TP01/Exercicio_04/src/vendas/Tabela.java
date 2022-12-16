package vendas;

public class Tabela {
	
	public int[] semana = new int[4];
	public int total_mes;
	public int total_ano;
	
	public Tabela (int semana1, int semana2, int semana3, int semana4, int mes, int ano) {
		this.semana[0] = semana1;
		this.semana[1] = semana2;
		this.semana[2] = semana3;
		this.semana[3] = semana4;
		this.total_mes = mes;
		this.total_ano = ano;
	}

}
