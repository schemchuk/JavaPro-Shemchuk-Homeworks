package de.telran.module5.homeWork2;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
