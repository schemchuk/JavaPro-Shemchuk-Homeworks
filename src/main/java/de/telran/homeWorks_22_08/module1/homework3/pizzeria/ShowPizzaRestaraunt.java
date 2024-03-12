package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class ShowPizzaRestaraunt {
    public static void main(String[] args) {

        Cashier cashier = new CashierImplement();
        Waiter waiter = new WaiterImplement();
        Chef chef = new ChefImplement();
        Cleaner cleaner = new CleanerImplement();

        PizzaRestaraunt pizzaRestaraunt = new PizzaRestaraunt(cashier, waiter, chef, cleaner);

        pizzaRestaraunt.customerOrder();
        pizzaRestaraunt.cleanUp();
    }
}
