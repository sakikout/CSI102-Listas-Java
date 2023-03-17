package comparable.comparator;

public class Inteiro {
	private int num;
	private double numD;
	
	public Inteiro (int num) {
		this.num = num;
		this.numD = (double) num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getNumD() {
		return numD;
	}

	public void setNumD(double numD) {
		this.numD = numD;
	}
	
	
}
