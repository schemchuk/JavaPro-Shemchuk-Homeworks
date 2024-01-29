package de.telran.module5.homeWork2;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super("Wrong password");
    }
    public WrongPasswordException(String message){
        super((message));
    }
}
