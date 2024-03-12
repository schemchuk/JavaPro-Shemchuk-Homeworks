package de.telran.homeWorks_22_08.module1.homework3.message;

public class WhatsApp implements Messenger{
    private String lastMessage;
    @Override
    public void sendMessage(String message) {
        System.out.println("Setting WHatsApp message: " + message);
        lastMessage = message;
    }

    @Override
    public String getMessage() {
        System.out.println("Receiving WhatsApp message: " + lastMessage);
        return lastMessage;
    }
}
