package number;

public class Number {
	private int value;
	
	public void setValue(int num) {
		this.value = num;
	}
	public int getValue() {
		return this.value;
	}
	
	
	@Override
	public String toString() {
		String numero = String.valueOf(this.value);
		return numero;
	}
	
	@Override
	public int hashCode() {
		return this.value;
	}
	
	
	public boolean equals(Number o) {
		if (o instanceof Number || o instanceof Object) {
			if (this.toString().equals(o.toString())) {
				return true;
			}
			return false;
		}
		return false;
	}
}
