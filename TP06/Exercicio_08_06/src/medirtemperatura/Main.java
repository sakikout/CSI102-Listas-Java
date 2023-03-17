package medirtemperatura;

public class Main {
	public static void main (String[] args) {
		MedidorFarenheit medidorF = new MedidorFarenheit();
		MedidorCelsiusIF termometro = new TermometroAdapter(medidorF);
		
		double temperatura = termometro.medirTemperatura();
		System.out.println("Temperatura: " + temperatura);
	}
}
