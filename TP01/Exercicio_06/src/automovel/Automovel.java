package automovel;

import java.util.Scanner;

public class Automovel {
	
	public static Scanner leitor = new Scanner(System.in);
	
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private int potencia;
	private float tanque;
	private float gasolina;
	private boolean ligado;
	private float velocidade;
	private float quilometros;
	
	
	public int isLigado() {
		if (this.ligado == true) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void ligarVeiculo() {
		if (this.isLigado() == 1) {
			System.out.println("O carro já está ligado!");
		} else {
			this.ligado = true;
		}
	}
	
	public void desligarVeiculo() {
		if (this.isLigado() == 1) {
			this.ligado = false;
		} else {
			System.out.println("O carro já está desligado!");
		}
	}
	
	public float acelerar() {
		if (this.isLigado() == 1) {
			this.velocidade++;
			this.gasolina--;
		} else if (this.isLigado()== 0) {
			System.out.println("O carro está desligado!");
			this.velocidade = 0;
		}
		
		if (this.tanque <= 0) {
			System.out.println("O tanque está vazio!");
			this.velocidade = 0;
		}
		return this.velocidade;
	}
	
	public float desacelerar() {
		if (this.isLigado() == 1) {
			this.velocidade--;
			this.gasolina--;
		} else if (this.isLigado()== 0) {
			System.out.println("O carro está desligado!");
			this.velocidade = 0;
		}
		
		if (this.tanque <= 0) {
			System.out.println("O tanque está vazio!");
			this.velocidade = 0;
		}
		return this.velocidade;
	}
	
	public float freiar() {
		if (this.isLigado() == 1) {
			this.velocidade = 0;
		} else {
			System.out.println("O carro está desligado!");
			this.velocidade = 0;
		}
		return this.velocidade;
	}
	
	public void setQuilometrosAndados(int metros) {
		this.quilometros = metros;
	}
	
	public float getQuilometrosAndados() {
		return this.quilometros;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getPotencia() {
		return this.potencia;
	}
	
	public void setTanque(float tanque) {
		if (tanque < 30) {
			System.out.println("O tanque é muito pouco para um carro!");
			System.out.println("Definindo para mínimo (30L)");
			this.tanque = 30;
		} else if (tanque > 85) {
			System.out.println("O tanque é muito para um carro!");
			System.out.println("Definindo para máximo (85L)");
			this.tanque = 85;
		} else {
			this.tanque = tanque;
		}
		
	}
	public float getTanque() {
		return this.tanque;
	}
	
	public void abastecerCarro(float gas) {
		if (gas < this.tanque) {
			System.out.println("Invalido! Definindo gasolina para 0L");
			this.gasolina = 0;
		} else if (gas > this.tanque) {
			System.out.println("A gasolina não pode ser maior que a capacidade do tanque!");
			System.out.println("Definindo para máximo: " + this.tanque);
			this.gasolina = this.tanque;
		} else {
			this.gasolina = gas;
		}
		
	}
	
	public void getGasolina() {
		if (this.gasolina == 0) {
			System.out.println("O carro está sem gasolina!");
		} else {
			System.out.println("Gasolina disponível: " + this.gasolina);
		}
	}
	
	public static void criarCarro(Automovel carro) {
		System.out.println("INSIRA AS INFORMAÇÕES DO VEÍCULO");
		System.out.printf("Marca: ");
		carro.setMarca(leitor.next());
		
		System.out.printf("Modelo: ");
		carro.setModelo(leitor.next());
		
		System.out.printf("Ano: ");
		carro.setAno(leitor.nextInt());
		
		System.out.printf("Potencia: ");
		carro.setPotencia(leitor.nextInt());
		
		System.out.printf("Cor: ");
		carro.setCor(leitor.next());
		
		System.out.printf("Tanque: ");
		carro.setTanque(leitor.nextFloat());
		carro.abastecerCarro(carro.getTanque());
		
		
	}
	
	public static void mostrarCarro(Automovel carro) {
		System.out.println("-------------- INFORMAÇÕES DO VEÍCULO ----------------");
		System.out.println("Marca: " + carro.getMarca());
		
		System.out.println("Modelo: " + carro.getModelo());
		
		System.out.println("Ano: " + carro.getAno());
		
		System.out.println("Potencia: " + carro.getPotencia());
		
		System.out.println("Cor: " + carro.getCor());
		
		System.out.println("Tanque: " + carro.getTanque());
		
		System.out.println("-------------------------------------------------------");
		
		
		
	}
	
	/*
	 * Carro VERBOS: dirigir, acelerar, freiar, ligar.
	 * Carro SUBSTANTIVOS: modelo, marca, ano, cor, potencia, tanque.
	 * RELACIONAMENTOS: 
	 * - o modelo varia de acordo com a marca do carro. 
	 * - as cores são fixas dependendo do modelo do carro.
	 * - o tanque varia de acordo com o modelo do carro.
	 * - a aceleração varia de acordo com a potencia do carro.
	 * - a potencia do carro varia de acordo com o modelo.
	 */
}
