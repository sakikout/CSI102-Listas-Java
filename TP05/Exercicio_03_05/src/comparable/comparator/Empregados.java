package comparable.comparator;

import java.util.ArrayList;

public class Empregados implements Comparable{
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		try {
		for (Funcionario pessoa : this.funcionarios) {
			if (pessoa.equals(funcionario)) {
				this.funcionarios.remove(pessoa);
			}
		}
		} finally {
			System.out.println("Esse funcionário não existe na lista.");
		}
	}
	
	public int tamanhoLista() {
		return this.funcionarios.size();
	}
	
	public void limparLista() {
		this.funcionarios.clear();
	}
	
	public void mostrarFuncionarios() {
		for (Funcionario pessoa : this.funcionarios) {
			System.out.println(pessoa.mostrarFuncionario());
		}
	}
	
	public void mostrarLista() {
		for (Funcionario pessoa : this.funcionarios) {
			System.out.println(pessoa.getNome());
		}
	}
	
	private int Alfabeto(String A, int n) {
		char letraA = A.toUpperCase().charAt(n);
		int ordemA;
		switch(letraA) {
		case 'A': ordemA = 1;
			break;
		case 'B': ordemA = 2;
			break;
		case 'C': ordemA = 3;
			break;
		case 'D': ordemA = 4;
			break;
		case 'E': ordemA = 5;
			break;
		case 'F': ordemA = 6;
			break;
		case 'G': ordemA = 7;
			break;
		case 'H': ordemA = 8;
			break;
		case 'I': ordemA = 9;
			break;
		case 'J': ordemA = 10;
			break;
		case 'K': ordemA = 11;
			break;
		case 'L': ordemA = 12;
			break;
		case 'M': ordemA = 13;
			break;
		case 'N': ordemA = 14;
			break;
		case 'O': ordemA = 15;
			break;
		case 'P': ordemA = 16;
			break;
		case 'Q': ordemA = 17;
			break;
		case 'R': ordemA = 18;
			break;
		case 'S': ordemA = 19;
			break;
		case 'T': ordemA = 20;
			break;
		case 'U': ordemA = 21;
			break;
		case 'V': ordemA = 22;
			break;
		case 'W': ordemA = 23;
			break;
		case 'X': ordemA = 24;
			break;
		case 'Y': ordemA = 25;
			break;
		case 'Z': ordemA = 26;
			break;
		default: ordemA = -1;
			break;
		}
		
		return ordemA;
	}

	@Override
	public void ordenarSalario() {
		double[] salarios = new double[this.funcionarios.size()];
		int i = 0;
		for (Funcionario f : this.funcionarios) {
			salarios[i] = f.getSalario();
			i++;
		}
		
		Funcionario auxFun1, auxFun2;
		double auxSal;
		
		for(i = 0; i < salarios.length; i++) {
			for(int j = 1; j < salarios.length; j++) {
				if(salarios[i] > salarios[j]) {
					auxSal = salarios[i];
					salarios[i] = salarios[j];
					auxFun1 = this.funcionarios.get(j);
					auxFun2 = this.funcionarios.get(i);
					this.funcionarios.add(i, auxFun1);
					this.funcionarios.add(j, auxFun2);
				} else {
					continue;
				}
			}
		}
		System.out.println("Funcionarios ordenados do menor salário para o maior.");
		this.mostrarLista();
	}

	@Override
	public void ordenarAlfabeto() {
		int i = 0, j = 0, flag = 1;
		int auxA, auxB;
		String temp;
		boolean[] comparacao = new boolean[this.funcionarios.size()];
		String[] nomes = new String[this.funcionarios.size()];
		
		for (Funcionario f : this.funcionarios) {
			nomes[i] = f.getNome();
			i++;
		}
		
		for (i = 0; i < nomes.length; i++) {
			auxA = this.ordemAlfabeto(nomes[i]);
			for(j = 1; j < nomes.length; j++) {
				auxB = this.ordemAlfabeto(nomes[j]);
				if (auxB < auxA) {
					temp = nomes[j];
					nomes[j] = nomes[i];
					nomes[i] = temp;
				}
			}
			
		}
		
		ArrayList<Funcionario> empregados = new ArrayList<Funcionario>();
		i = 0;
		while (i < nomes.length) {
			for (Funcionario f : this.funcionarios) {
				if (f.getNome().equals(nomes[i])) {
					empregados.add(f);
					i++;
				}
			}
		}

		
		j = 1;
		for(i = 0; i < nomes.length; i++) {
			comparacao[i] = this.compararAlfabeto(nomes[i], nomes[j]);
			j++;
		}
		
		for(i = 0; i < nomes.length; i++) {
			if (comparacao[i] == true) {
				continue;
			} else {
				flag = 0;
			}
		}
		
		this.funcionarios = empregados;
		
		if (flag == 1) {
			System.out.println("Lista de funcionarios ordenada alfabeticamente.");
			this.mostrarLista();
		} else {
			System.out.println("Houve um erro na ordenação.");
		}
		
	}
	
	public int ordemAlfabeto(String A) {
		int ordemA = 0;
		for (int i = 0; i < A.length(); i++) {
			ordemA += this.Alfabeto(A, i);
	
		}
		return ordemA;
	}

	@Override
	public boolean compararAlfabeto(String A, String B) {
		int ordemA, ordemB;
		boolean resultado = false;
		
		ordemA = this.Alfabeto(A, 0);
		ordemB = this.Alfabeto(B, 0);
		
		if(ordemA == ordemB) {
			for (int i = 1; i < A.length(); i++) {
				ordemA += this.Alfabeto(A, i);
				ordemB += this.Alfabeto(B, i);
			}
			if (A.length() > B.length()) {
				return false;
			} else if (A.length() < B.length()) {
				return true;
			} else {
				resultado = (ordemA < ordemB);
			}
		}
		
		return resultado;
	}

	@Override
	public Funcionario maiorSalario() {
		Funcionario auxFun = null;
		double maiorSal = 0;
		for (Funcionario f : this.funcionarios) {
			if (f.getSalario() > maiorSal) {
				maiorSal = f.getSalario();
				auxFun = f;
			}
		}
		return auxFun;
	}

	@Override
	public Funcionario menorSalario() {
		Funcionario auxFun = null;
		double menorSal = 99;
		for (Funcionario f : this.funcionarios) {
			if (f.getSalario() < menorSal) {
				menorSal = f.getSalario();
				auxFun = f;
			}
		}
		return auxFun;
	}

	@Override
	public Funcionario maisExperiente() {
		Funcionario funcionarioAux = null;
		int anoAux = this.funcionarios.get(0).getAno();
		int mesAux= this.funcionarios.get(0).getMes();
		int diaAux= this.funcionarios.get(0).getDia();
		
		for (Funcionario f : this.funcionarios) {
			if (f.getAno() < anoAux) {
				funcionarioAux = f;
				anoAux = f.getAno();
			} else if (f.getAno() == anoAux) {
				if (f.getMes() < mesAux) {
					mesAux = f.getMes();
					funcionarioAux = f;
				} else if (f.getMes() == mesAux) {
					if (f.getDia() < diaAux) {
						diaAux = f.getDia();
						funcionarioAux = f;
				}
			}
		}
		
	}
		
		return funcionarioAux;
	}

	@Override
	public Funcionario menosExperiente() {
		Funcionario funcionarioAux = null;
		int anoAux = this.funcionarios.get(0).getAno();
		int mesAux= this.funcionarios.get(0).getMes();
		int diaAux= this.funcionarios.get(0).getDia();
		
		for (Funcionario f : this.funcionarios) {
			if (f.getAno() > anoAux) {
				funcionarioAux = f;
				anoAux = f.getAno();
			} else if (f.getAno() == anoAux) {
				if (f.getMes() > mesAux) {
					mesAux = f.getMes();
					funcionarioAux = f;
				} else if (f.getMes() == mesAux) {
					if (f.getDia() > diaAux) {
						diaAux = f.getDia();
						funcionarioAux = f;
				}
			}
		}
	}
		
		return funcionarioAux;
}
	
}
