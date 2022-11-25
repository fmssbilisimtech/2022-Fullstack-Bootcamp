package com.turkcell.restapibestpractices.exception;


public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
