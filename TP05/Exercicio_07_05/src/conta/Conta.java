package conta;

public class Conta {
	public String titular;
	public double dinheiro = 0;
	public double limite;
	
	public void definirTitular(String nome) {
		this.titular = nome;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setLimite(double num) {
		this.limite = num;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void deposita(double num) throws ContaExcecao {
		if( this.dinheiro + num > this.limite) {
			throw new ContaExcecao();
		} else {
			this.dinheiro += num;
			System.out.println(num + " reais depositado");
		}
	}
	
	public void saca(double num) throws ContaExcecao {
		if( this.dinheiro - num < 0) {
			throw new ContaExcecao();
		} else {
			this.dinheiro -= num;
			System.out.println(num + " reais sacado");
		}
	}
	
	public double getDinheiroDisponivel() {
		return this.dinheiro;
	}
	
	public void informacoesConta() {
		System.out.println(">>>>>>>>>INFORMACOES DA CONTA<<<<<<<<<");
		System.out.println("TITULAR: " + this.titular);
		System.out.println("LIMITE: " + this.limite);
		System.out.println("SALDO ATUAL: " + this.dinheiro);
		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
	}
}