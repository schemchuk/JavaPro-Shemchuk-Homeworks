package de.telran.homeWorks_22_08.module1.module6.homeWork3.shoot;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Shooting extends Thread {
    private static AtomicBoolean isHit = new AtomicBoolean(false);

    @Override
    public void run() {
        super.run();
    }

    public Shooting(String name) {
        Random random = new Random();

        while (!isHit.get()) {
            if (random.nextBoolean()) {
                isHit.set(true);
                System.out.println("Мишень поражена и разрушена");
            } else {
                System.out.println("Промах. Мишень целая");
            }
        }


    }
}
