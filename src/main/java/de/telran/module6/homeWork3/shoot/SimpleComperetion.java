package de.telran.module6.homeWork3.shoot;

public class SimpleComperetion {
    public static void main(String[] args) {
        Shooting[] shooters = new Shooting[5];

        for (int i = 0; i < 5; i++) {
            shooters[i] = new Shooting("Серелок " + (i + 1));
            shooters[i].start();
        }
        for (Shooting sh : shooters) {
            try {
                sh.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("DONE");
    }
}
