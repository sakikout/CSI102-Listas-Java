package somador;

public class Main {
	public static void main (String[] args) {
		Cliente cliente;
		SomadorExistente somadorExistente = new SomadorExistente();
		SomadorEsperado somador = new AdapterSomador(somadorExistente);
		
		cliente = new Cliente(somador);
		cliente.exercutar();
	}
}
