package org.example;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String errorMessage) {
        super(errorMessage);
    }
}
