package cartoes.datas;

public class Aniversario extends CartaoWeb {
	
	public Aniversario(String nome) {
		super();
		super.setDestinatario(nome);
	}
	
	@Override
	public void showMessage() {
		System.out.println("Hoje é um dia muito especial - seu aniverário, " + super.getDestinatario() + "!");
		System.out.println("Feliz aniversário, e tudo de bom para você sempre!");
	}
}
