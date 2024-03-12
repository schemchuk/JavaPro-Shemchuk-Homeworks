package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class CashierImplement implements Cashier{
    @Override
    public void generateBill() {
        System.out.println("I write the bill!");
    }

    @Override
    public void takePayment() {
        System.out.println("I assert payment of account");
    }
}
