package de.telran.homeWorks_22_08.module1.homework3.pizzeria;

public class ChefImplement implements Chef{
    @Override
    public void prepareOrder() {
        System.out.println("I prepare order");
    }

    @Override
    public void serveOrder() {
        System.out.println("I'm plaching an order");
    }

    @Override
    public void washDishes() {
        System.out.println("Sometimes I can change the dishes");
    }
}
