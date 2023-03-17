package calculator.calculatorexception;

import java.io.IOException;
import java.util.Scanner;

import calculator.Calculator;

public class App {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main (String[] args) {
		Calculator calculadora = new Calculator();
		
		try {
			Menu(calculadora);
		} catch (Exception error) {
			System.out.println(error.getStackTrace());
			System.out.println(error.getLocalizedMessage());	
		}
		
		
	}
	
	public static void Menu(Calculator calculadora) throws Exception{
		int resposta;
		
		do {
			clear();
			menuMensagem();
			System.out.println("\nInsira uma opcao: ");
			resposta = leitor.nextInt();
			 
			 switch(resposta) {
				case 1: 	
					
					calculadora.inserirNumeros();
					calculadora.div();
					
					break;
				case 2: 
					double resposta2;
					clear();
					System.out.printf("Insira o numero para o calculo do logartimo: ");
					resposta2 = leitor.nextDouble();
				
					calculadora.log10(resposta2);
						
					break;
				case 3: 
					calculadora.inserirNumeros();
					double sub = calculadora.subtracao();
					System.out.println("Subtração de " + calculadora.getNum2() + " por " + calculadora.getNum1() + " = " + sub + "\n");
					
					break;
				case 4: 
					calculadora.inserirNumeros();
					double sum = calculadora.soma();
					System.out.println("Soma de " + calculadora.getNum2() + " por " + calculadora.getNum1() + " = " + sum + "\n");
					
					break;
				case 5: 
					calculadora.inserirNumeros();
					double multi = calculadora.multiplicacao();
					System.out.println("Multiplicação de " + calculadora.getNum1() + " por " + calculadora.getNum2() + " = " + multi + "\n");
					
					break;
				case 6:
					System.out.println("Finalizado.");
					return;
				default: 
					System.out.println("Insira uma opção VÁLIDA.");
					break;
				}
		} while (resposta != 6);
		
	}
	
	public static void menuMensagem() {
		System.out.println(">>>>>>>>>OPERACOES DISPONIVEIS<<<<<<<<<");
		System.out.println("1- Divisão");
		System.out.println("2- Logarítimo");
		System.out.println("3- Subtração");
		System.out.println("4- Soma");
		System.out.println("5- Multiplicação");
		System.out.println("6- Sair");
	}
	
	public static void clear() throws IOException, InterruptedException {
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}
}
