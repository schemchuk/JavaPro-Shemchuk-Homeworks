package de.telran.homeWorks_22_08.module1.module6.homeWork2.hotel;

public class Request implements Runnable{

    ThreadInteraction interaction;
    String[] request = {
            "What do you want?",
            "Many on table!",
            "Take the key"
    };

    public Request(ThreadInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Request").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < request.length; i++) {
            interaction.Request(request[i]);
        }
    }

}
