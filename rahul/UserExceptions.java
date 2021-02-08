package n2s.ehc.rahul;

public class UserExceptions  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 806195727466000168L;

	public UserExceptions() {
		
	}

	public UserExceptions(String s) {
		super(s);
	}
}

class InvalidEntry extends UserExceptions{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4379089641789445641L;

	public InvalidEntry(String s) {
		super(s);
	}
}

class InvalidUserId extends UserExceptions{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1393794193177362178L;

	public InvalidUserId(String s) {
		super(s);
	}
}

class UserIdNotFound extends UserExceptions{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5039765417432211541L;

	public UserIdNotFound(String s) {
		super(s);
	}
}
 
