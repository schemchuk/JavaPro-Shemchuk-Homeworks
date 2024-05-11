package de.telran.myNewsGroup.module4.homeWork1.exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        // super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
