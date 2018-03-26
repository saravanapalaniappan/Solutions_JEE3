package com.htc.financials.exceptions;

public class InvalidAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String exceptionMessage;

	public InvalidAmountException() {
		super();
	}

	public InvalidAmountException(String message) {
		super(message);
		this.exceptionMessage = message;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [error_messsage=" + exceptionMessage + "]";
	}

	@Override
	public String getMessage() {
		return this.exceptionMessage;
	}
}
