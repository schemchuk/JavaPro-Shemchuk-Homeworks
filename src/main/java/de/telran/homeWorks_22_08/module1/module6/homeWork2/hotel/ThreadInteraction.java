package de.telran.homeWorks_22_08.module1.module6.homeWork2.hotel;

public class ThreadInteraction {
    boolean isActive = false;

    public synchronized void Request(String request) {
        if (isActive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Admin: ");
        System.out.println(request);
        isActive = true;
        notify();
    }

    public synchronized void Response(String response) {
        if (!isActive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Client: ");
        System.out.println(response);
        isActive = false;
        notify();
    }

}
