package comparable.comparator;

public interface Comparable {
	
	void ordenarSalario();
	void ordenarAlfabeto();
	boolean compararAlfabeto(String A, String B);
	Funcionario maiorSalario();
	Funcionario menorSalario();
	Funcionario maisExperiente();
	Funcionario menosExperiente();
}
