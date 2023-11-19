package de.telran.module1.homework3.pizzeria;

public class ClinnerImplement implements Clinner{
    @Override
    public void cleanTable() {
        System.out.println("I wash the table");
    }

    @Override
    public void washDishes() {
        System.out.println("I wash the dishes");
    }
}
