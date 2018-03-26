package com.santy.exceptionhandler;

/**
 * Created by santhoshpc on 25-03-2018.
 */
public class InvalidAmountException extends Exception {
    String error_messsage;

    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException(String message) {
        super(message);
        this.error_messsage = message;
    }

    @Override
    public String toString() {
        return "InvalidAmountException [error_messsage=" + error_messsage + "]";
    }

    @Override
    public String getMessage() {
        return this.error_messsage;
    }

}
