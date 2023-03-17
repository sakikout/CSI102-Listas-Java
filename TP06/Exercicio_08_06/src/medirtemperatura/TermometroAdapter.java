package medirtemperatura;

public class TermometroAdapter implements MedidorCelsiusIF {
	private MedidorFarenheit termometroF;
	private double tempF;
	private double tempC;
	
	public TermometroAdapter(MedidorFarenheit termometro) {
		this.termometroF = termometro;
	}
	
	@Override
	public double medirTemperatura() {
		this.tempF = this.termometroF.getTemperaturaFarenheit();
		System.out.println("Temperatura Farenheit: " + this.tempF);
		this.tempC = (this.tempF - 32) / (1.8);
		
		return this.tempC;
	}
	
	/*
	public void mostrarTemperatura() {
		System.out.println("Temperatura\nCelsius: " + this.tempC + "\nFarenheit: " + this.tempF );
	}
	*/
}
