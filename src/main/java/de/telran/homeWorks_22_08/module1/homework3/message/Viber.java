package de.telran.homeWorks_22_08.module1.homework3.message;

public class Viber implements Messenger{
    private String lastMessage;
    @Override
    public void sendMessage(String message) {
        System.out.println("Setting Viber message: " + message );   //"I send notifications to Viber"
        lastMessage = message;
    }

    @Override
    public String getMessage() {
        System.out.println("Receiving Viber messade: " + lastMessage);
        return lastMessage;
    }
}
