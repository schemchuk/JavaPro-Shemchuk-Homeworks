package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class CleanerImplement implements Cleaner {
    @Override
    public void cleanTable() {
        System.out.println("I wash the table");
    }

    @Override
    public void washDishes() {
        System.out.println("I wash the dishes");
    }
}
