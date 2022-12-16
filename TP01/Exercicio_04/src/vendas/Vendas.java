package vendas;

import java.util.Scanner;

public class Vendas {
	
	static Scanner leitor = new Scanner(System.in);
	
	
	public static void main (String[] args) {
		Tabela[] tabela_mes = new Tabela[12];
		
		int[][] total_ano = new int[12][4];
		int totalAno;
		int[] totalMeses = new int[12];
		int i, j;
		
		System.out.println("Insira o total vendido por semana:");
		
		for (i = 0; i < 12; i ++) {
			System.out.printf("Mês %d\n", i + 1);
			for (j = 0; j < 4; j ++) {
				System.out.printf("Semana %d: ", j + 1);
				total_ano[i][j] = leitor.nextInt();
			}
			System.out.println(" ");
		}
		
		totalAno = calcularTotalAno(total_ano);
		
		for (i = 0; i < 12; i ++) {
			totalMeses[i] = calcularTotalMes(total_ano, i);
			tabela_mes[i] = new Tabela(total_ano[i][0], total_ano[i][1], total_ano[i][2], total_ano[i][3], totalMeses[i], totalAno);
		}
		
		gerarRelatorio(tabela_mes, totalAno);
	}
	
	public static int calcularTotalMes(int matriz[][], int mes) {
		int j;
		int  total_mes = 0;
		
		for (j = 0; j < 4; j ++) {
			total_mes += matriz[mes][j];
		}
		
		return total_mes;
	}
	
	public static int calcularTotalAno(int matriz[][]) {
		int i, j;
		int  total_ano = 0;
		
		for (i = 0; i < 12; i ++) {
			for (j = 0; j < 4; j ++) {
				total_ano += matriz[i][j];
			}
		
		}
		
		return total_ano;
	}
	
	public static void gerarRelatorio (Tabela tabela[], int totaldoano) {
		int i, j;
		String nome = null;
		System.out.println("-------------------- VENDAS DO ANO ----------------------");
		for ( i = 0; i < 12; i++) {
			switch (i) {
				case 0: nome = "Janeiro"; break;
				case 1: nome = "Fevereiro"; break;
				case 2: nome = "Março"; break;
				case 3: nome = "Abril"; break;
				case 4: nome = "Maio"; break;
				case 5: nome = "Junho"; break;
				case 6: nome = "Julho"; break;
				case 7: nome = "Agosto"; break;
				case 8: nome = "Setembro"; break;
				case 9: nome = "Outubro"; break;
				case 10: nome = "Novembro"; break;
				case 11: nome = "Dezembro"; break;
				default: System.out.println("Invalido."); break;
				
			}
			
			System.out.printf("MÊS: %s\n", nome);
			for (j = 0; j < 4; j++) {
				System.out.printf("TOTAL DA SEMANA %d: %d\n", j + 1, tabela[i].semana[j]);
			}
			System.out.printf("TOTAL DO MÊS: %d\n\n", tabela[i].total_mes);
		}
		
		System.out.printf("TOTAL DO ANO: %d\n", totaldoano);
		System.out.println("---------------------------------------------------------");
	}

}
