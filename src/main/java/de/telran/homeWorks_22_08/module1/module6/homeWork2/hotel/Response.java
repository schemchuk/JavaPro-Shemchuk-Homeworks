package de.telran.homeWorks_22_08.module1.module6.homeWork2.hotel;

public class Response implements  Runnable{
    ThreadInteraction interaction;
    String[] response = {
            "I want the room.",
            "These is fifty dollars. Witout the rest"
    };

    public Response(ThreadInteraction interaction) {
        this.interaction = interaction;
        new Thread(this,"Response").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < response.length; i++) {
            interaction.Response(response[i]);
        }
    }

}
