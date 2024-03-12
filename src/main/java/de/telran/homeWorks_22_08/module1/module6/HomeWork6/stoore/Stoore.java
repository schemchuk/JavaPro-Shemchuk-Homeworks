package de.telran.homeWorks_22_08.module1.module6.HomeWork6.stoore;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Stoore {
    private static final int TOTAL_CUSTOMERS = 10000;
    private static final int CUSTOMERS_INSIDE = 10;
    private static final int SERVIS_TIME = 30;

    private static int customersCount = 0;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(CUSTOMERS_INSIDE);
        Semaphore semaphore = new Semaphore(CUSTOMERS_INSIDE);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            executorService.submit(new Customer(semaphore, customersCount++));
        }
            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();


            long endTime = System.currentTimeMillis();

            System.out.println("All customers have been served");
            long totalTime = endTime - startTime;
            System.out.println("Total service time: " + totalTime + "milisecond");
        }

    }

    static class Customer implements Runnable {

        private final Semaphore semaphore;
        private final int customerID;

        public Customer(Semaphore semaphore, int customerID) {
            this.semaphore = semaphore;

            this.customerID = customerID;
        }

        @Override
        public void run() {

            try {
                semaphore.acquire();
                System.out.println("Customer " + customerID + " entered the story");
                TimeUnit.SECONDS.sleep(SERVIS_TIME);
                System.out.println("Customer " + customerID + " left the story");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    private static String formatTime(long millis) {
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}

