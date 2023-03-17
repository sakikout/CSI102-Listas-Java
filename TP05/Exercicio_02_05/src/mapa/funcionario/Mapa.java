package mapa.funcionario;

import java.util.HashMap;

public class Mapa extends Identifier{
	private HashMap<String, String> funcionarios = new HashMap<String, String>();
	private HashMap<String, Funcionario> operarios = new HashMap<String, Funcionario>();
	private Funcionario funcionario;
	
	public Mapa () {
		super();
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getFuncionario(String id) {
		int flag = 0;
		for (String s : this.funcionarios.keySet()) {
			if (s.toLowerCase().equals(id) || s.toUpperCase().equals(id)) {
				flag = 1;
				return "Funcionario: " + funcionarios.get(s) + ", ID: " + id;
			}
		}
		
		if (flag == 0) {
			for (String j : this.operarios.keySet()) {
				if (j.toLowerCase().equals(id) || j.toUpperCase().equals(id)) {
					return "Funcionario: " + funcionarios.get(j) + ", ID: " + id;
				}
			}
		}
	return "Funcionario não encontrado no sistema." ;
}
	
	public void mostrarInformacoes() {
		for (String j : this.operarios.keySet()) {
			this.funcionario = this.operarios.get(j);
			this.funcionario.mostrarInformacoes();
		}
	}
	
	public void mostrarFuncionario(String id) {
		for (String j : this.operarios.keySet()) {
			if (j.toLowerCase().equals(id) || j.toUpperCase().equals(id)) {
				this.funcionario = operarios.get(j);
				this.funcionario.mostrarInformacoes();
			}
		}
	}
	
	public void adicionarFuncionario(String nome, String id) {
		this.funcionarios.put(id, nome);
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.put(funcionario.getID(), funcionario.getNome());
		this.operarios.put(funcionario.getID(), funcionario);
	}
	
	public void removerFuncionario(String id) {
		for (String s : this.funcionarios.keySet()) {
			if (s.toLowerCase().equals(id) || s.toUpperCase().equals(id)) {
				this.funcionarios.remove(id);
				this.operarios.remove(id);
				
			}
		}
	}
	
	public void clearMap() {
		this.funcionarios.clear();
		this.operarios.clear();
	}
}
