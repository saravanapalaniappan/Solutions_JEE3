
public class TraineeNotFoundException extends Exception {
	String error_messsage;

	public TraineeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraineeNotFoundException(String message) {
		//super(message);
		
		this.error_messsage=message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TraineeNotFoundException [error_messsage=" + error_messsage + "]";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.error_messsage;
	}
	
	
	
	

}