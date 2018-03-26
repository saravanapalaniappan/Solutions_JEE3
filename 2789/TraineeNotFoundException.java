package com.santy.exceptionhandler;

/**
 * Custom exception - TaineeNotFound
 */
public class TraineeNotFoundException extends Exception {
    String error_messsage;

    public TraineeNotFoundException() {
        super();
    }

    public TraineeNotFoundException(String message) {
        super(message);
        this.error_messsage=message;
    }

    @Override
    public String toString() {
        return "EmployeeNotFoundException [error_messsage=" + error_messsage + "]";
    }

    @Override
    public String getMessage() {
        return this.error_messsage;
    }

}
