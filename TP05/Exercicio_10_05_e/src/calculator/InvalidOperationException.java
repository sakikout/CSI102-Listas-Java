package calculator;

public class InvalidOperationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidOperationException(Exception e) {
		super(e.getMessage());
	}
	
	public InvalidOperationException(String error) {
		super(error);
	}
}
