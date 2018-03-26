package com.htc.financials.exceptions;

public class InsufficientFundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4138723753539582142L;
	String exceptionMessage;

	public InsufficientFundException() {
		super();
	}

	public InsufficientFundException(String message) {
		super(message);
		this.exceptionMessage = message;
	}

	@Override
	public String toString() {
		return "InsufficientFundException [error_messsage=" + exceptionMessage + "]";
	}

	@Override
	public String getMessage() {
		return this.exceptionMessage;
	}

}
