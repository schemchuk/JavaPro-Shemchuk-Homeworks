package de.telran.homeWorks_22_08.module1.homeWork5.coffeeAutomat;

public class CoffeeMashine {
    private static CoffeeMashine instance;

    private CoffeeMashine() {}

    public static CoffeeMashine getInstance() {
        if (instance == null) {
            instance = new CoffeeMashine();
        }
        return instance;
    }
    public void makeBlackCoffee() {
        System.out.println("Возьмите свой кофе");
    }

    public void makeCoffeeWithCognac() {
        System.out.println("Отведайте кофе с коньячком");
    }

    public void makeCongasWitoutCaffee() {
        System.out.println("Желаете-с коньячку без кофия? Вам в нумер-с ?");
    }
}
