package de.telran.homeWorks_22_08.module1.module6.homeWork2.silmag;

public class Customer implements Runnable {
    private ThreadInteraction silmagInteraction;
    private String name;

    public Customer(ThreadInteraction silmagInteraction, String name) {
        this.silmagInteraction = silmagInteraction;
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            silmagInteraction.purchasedGoods(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

