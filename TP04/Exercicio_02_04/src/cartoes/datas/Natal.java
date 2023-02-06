package cartoes.datas;

public class Natal extends CartaoWeb {
	public Natal(String nome) {
		super();
		super.setDestinatario(nome);
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz Natal " + super.getDestinatario() + "!");
		System.out.println("Te desejo paz e saúde sempre, e um dia de muitas festas!");
	}
}
