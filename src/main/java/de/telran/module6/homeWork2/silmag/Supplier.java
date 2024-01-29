package de.telran.module6.homeWork2.silmag;
public class Supplier implements Runnable {
    private ThreadInteraction silmagInteraction;

    public Supplier(ThreadInteraction silmagInteraction) {
        this.silmagInteraction = silmagInteraction;
    }

    @Override
    public void run() {
        while (true) {
            silmagInteraction.supplierItem();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

