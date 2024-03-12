package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class WaiterImplement implements Waiter{
    @Override
    public void takeOrder() {
        System.out.println("I take Order");
    }

    @Override
    public void serveOrder() {
        System.out.println("I'm plaching an order");
    }

    @Override
    public void cleanTable() {
        System.out.println("I can sometimes wash the table");
    }

    @Override
    public void takePayment() {
        System.out.println("I take payment for the order");
    }
}
