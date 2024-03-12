package de.telran.homeWorks_22_08.module1.homework3.message;

public class ShowMessage {
    public static void main(String[] args) {
        Viber viber = new Viber();
        viber.sendMessage("Hello Omeljan! I'm also in Viber");
        viber.getMessage();

        Telegramm telegramm = new Telegramm();
        telegramm.sendMessage("Omeljan, I'm in Telegram now");
        telegramm.getMessage();

        WhatsApp whatsApp = new WhatsApp();
        whatsApp.sendMessage("Know Omeljan, WhatsApp is coll");
        whatsApp.getMessage();
    }
}
