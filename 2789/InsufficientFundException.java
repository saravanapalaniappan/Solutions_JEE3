package com.santy.exceptionhandler;

/**
 * Created by santhoshpc on 25-03-2018.
 */
public class InsufficientFundException extends Exception {
    String error_messsage;

    public InsufficientFundException() {
        super();
    }

    public InsufficientFundException(String message) {
        super(message);
        this.error_messsage = message;
    }

    @Override
    public String toString() {
        return "InsufficientFundException [error_messsage=" + error_messsage + "]";
    }

    @Override
    public String getMessage() {
        return this.error_messsage;
    }

}
