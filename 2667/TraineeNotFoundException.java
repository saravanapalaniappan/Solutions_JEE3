package com.htc.financials.exceptions;

public class TraineeNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String exceptionMessage;

	public TraineeNotFoundException() {
		super();
	}

	public TraineeNotFoundException(String message) {
		super(message);
		this.exceptionMessage = message;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [error_messsage=" + exceptionMessage + "]";
	}

	@Override
	public String getMessage() {
		return this.exceptionMessage;
	}

}
