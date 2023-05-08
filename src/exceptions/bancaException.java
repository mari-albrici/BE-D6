package exceptions;

public class bancaException extends Exception{
	
	private String message = "No funds available!";
	
	public BancaException(String message) {
		super(message);
		toString();
	}

}
