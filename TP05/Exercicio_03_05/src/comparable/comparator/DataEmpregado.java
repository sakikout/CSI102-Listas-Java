package comparable.comparator;

public abstract class DataEmpregado {
	private int dia;
	private int mes;
	private String mesNome;
	private int ano;
	
	public DataEmpregado(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		this.definirNomeMes();
	}
	
	private void definirNomeMes() {
		switch(this.mes) {
		case 1:
			this.mesNome = "Janeiro";
			break;
		case 2:
			this.mesNome = "Fevereiro";
			break;
		case 3:
			this.mesNome = "Março";
			break;
		case 4:
			this.mesNome = "Abril";
			break;
		case 5:
			this.mesNome = "Maio";
			break;
		case 6:
			this.mesNome = "Junho";
			break;
		case 7:
			this.mesNome = "Julho";
			break;
		case 8:
			this.mesNome = "Agosto";
			break;
		case 9:
			this.mesNome = "Setembro";
			break;
		case 10:
			this.mesNome = "Outubro";
			break;
		case 11:
			this.mesNome = "Novembro";
			break;
		case 12:
			this.mesNome = "Dezembro";
			break;
		default: 
			this.mesNome = "Invalido";
			break;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getMesNome() {
		return mesNome;
	}

	public void setMesNome(String mesNome) {
		this.mesNome = mesNome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
