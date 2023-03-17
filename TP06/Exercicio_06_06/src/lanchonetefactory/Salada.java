package lanchonetefactory;

public class Salada {
	private boolean temSalada = false;
	
	public Salada(String tem) {
		if (tem.equalsIgnoreCase("sim") || tem.equalsIgnoreCase("s") ) {
			this.temSalada = true;
			
		} else if (tem.equalsIgnoreCase("nao") || tem.equalsIgnoreCase("n")) {
			this.temSalada = false;
		} else {
			System.out.println("Resposta inválida.");
		}
	}
	
	public String toString() {
		if (!temSalada) {
			return "Sem verdura";
		} else {
			return "Com verdura";
		}
	}
}
