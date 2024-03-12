package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class PizzaRestaraunt {
    private Cashier cashier;
    private Waiter waiter;
    private Chef chef;
    private Cleaner cleaner;

    public PizzaRestaraunt(Cashier cashier, Waiter waiter, Chef chef, Cleaner cleaner) {
        this.cashier = cashier;
        this.waiter = waiter;
        this.chef = chef;
        this.cleaner = cleaner;
    }

    public void customerOrder() {
        waiter.takeOrder();
        chef.prepareOrder();
        waiter.serveOrder();
        cashier.generateBill();
        cashier.takePayment();
    }

    public void cleanUp() {
        cleaner.cleanTable();
        cleaner.washDishes();
    }
}
