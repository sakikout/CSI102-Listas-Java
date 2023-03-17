package calculator;

import calculator.calculatorexception.InvalidOperationException;
import java.util.Scanner;

public class Calculator {
	public static Scanner leitor = new Scanner(System.in);
	private double num1;
	private double num2;
	private double divisao;
	private double logaritmo;
	
	public void inserirNumeros() {
		System.out.println("Insira o primeiro numero: ");
		this.num1 = leitor.nextDouble();
		System.out.println("Insira o segundo numero: ");
		this.num2 = leitor.nextDouble();
	}
	
	
	
	public double getNum1() {
		return num1;
	}



	public void setNum1(double num1) {
		this.num1 = num1;
	}



	public double getNum2() {
		return num2;
	}



	public void setNum2(double num2) {
		this.num2 = num2;
	}

	


	public double getDivisao() {
		return divisao;
	}



	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}



	public double getLogaritmo() {
		return logaritmo;
	}



	public void setLogaritmo(double logaritmo) {
		this.logaritmo = logaritmo;
	}



	public double soma (double x, double y) {
		return x + y;
	}
	
	public double soma () {
		return this.num1 + this.num2;
	}
	
	public double subtracao(double x, double y) {
		return x - y;
	}
	
	public double subtracao() {
		return this.num1 - this.num2;
	}
	
	
	public double multiplicacao(double x, double y) {
		return x * y;
	}
	
	public double multiplicacao() {
		return this.num1 * this.num2;
	}
	
	public void div (double p, double q) throws Exception{
		double resultado;
		try {
			resultado = (p/q);
			if (q != 0 ) {
				this.divisao = resultado;
				System.out.println("Divisao de " + p + " por " + q + " = " + this.divisao + "\n");
			}
			
		} catch (Exception exception) {
			throw new InvalidOperationException(exception);
			
		}
		
	}
	
	public void div () throws Exception{
		double resultado;
		try {
			resultado = this.num1 / this.num2;
			
			if (this.num2 != 0 ) {
				this.divisao = resultado;
				System.out.println("Divisao de " + this.num1 + " por " + this.num2 + " = " + this.divisao + "\n");
			} else {
				throw new InvalidOperationException("Divisao por 0.");
			}
			
		} catch (Exception exception) {
			throw new InvalidOperationException(exception);
			
		}
		
	}
	
	public void log10 (double x) throws Exception{
		
		try {
			
			this.logaritmo = Math.log(x);
			
			if (x <= 0) {
				this.logaritmo = -1;
				throw new InvalidOperationException("Não é possível realizar o logarítmo de números menores ou iguais a zero.");
			}
			System.out.println("Logaritmo de " + x + ": " + this.logaritmo + "\n");
			
		} catch (Exception exception) {
			throw new InvalidOperationException(exception);
		}
		
		
	}
}
