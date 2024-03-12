package de.telran.homeWorks_22_08.module1.module5.homeWork2;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
