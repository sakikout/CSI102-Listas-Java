package cartoes.datas;

public class DiaDosNamorados extends CartaoWeb {
	
	public DiaDosNamorados(String nome) {
		super();
		super.setDestinatario(nome);
	}
	
	@Override
	public void showMessage() {
		System.out.println("Para minha pessoa favorita, você, " + super.getDestinatario());
		System.out.println("Eu te amo de mais!");
	}
}
