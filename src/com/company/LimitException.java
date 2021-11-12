package com.company;

public class LimitException extends Exception {
    public LimitException(String message) {
        super(message);
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
    }

    public LimitException() {

    }

    private void getRemainingAmount() {
    }
}
