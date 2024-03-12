package de.telran.homeWorks_22_08.module1.homework3.message;

public class Telegramm implements Messenger{
    private String lastMessage;
    @Override
    public void sendMessage(String message) {
        System.out.println("Setting Telegramm message: " + message);
        lastMessage = message;
    }

    @Override
    public String getMessage() {
        System.out.println("Receiving Telegramm message: " + lastMessage);
        return lastMessage;
    }
}
