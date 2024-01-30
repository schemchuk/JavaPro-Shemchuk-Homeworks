package de.telran.module6.homeWork1.robot;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Robots {



    static class Robot1 extends Thread {
        private final Semaphore semaphore;
        private final int total;

        Robot1(Semaphore semaphore, int total) {
            this.semaphore = semaphore;
            this.total = total;
        }


        @Override
        public void run() {

            for (int i = 0; i < total; i++) {
                try {
                    semaphore.acquire();
                    System.out.println("Робот1 положил деталь на стол");

                    semaphore.release();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    static class Robot2 extends Thread {
        private final Semaphore semaphore;
        private final int total;

        Robot2(Semaphore semaphore, int total) {
            this.semaphore = semaphore;
            this.total = total;
        }


        @Override
        public void run() {

            for (int i = 0; i < total; i++) {
                try {
                    semaphore.acquire();
                    System.out.println("Робот2 забрал деталь со столф");

                    semaphore.release();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
