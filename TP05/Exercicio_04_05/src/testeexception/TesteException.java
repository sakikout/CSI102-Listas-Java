package testeexception;

public class TesteException {
	public static void main (String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	
	static void metodo2() {
		try {
			System.out.println("Inicio do método 2");
			int[] array = new int[10];
		
			for(int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
		}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Fim do método 2");
		}
	}
	
}
