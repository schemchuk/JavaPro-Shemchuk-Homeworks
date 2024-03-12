package de.telran.homeWorks_22_08.module1.homeWork5.coffeeAutomat;

public class ShowCoffeeMashine {
    public static void main(String[] args) {
        CoffeeMashine coffeeMashine1 = CoffeeMashine.getInstance();
        CoffeeMashine coffeeMashine2 = CoffeeMashine.getInstance();
        CoffeeMashine coffeeMashine3 = CoffeeMashine.getInstance();

         EnumForCoffeemashine enumForCoffeemashine = EnumForCoffeemashine.INSTANCE;

        coffeeMashine1.makeBlackCoffee();
        coffeeMashine2.makeCoffeeWithCognac();
        coffeeMashine3.makeCongasWitoutCaffee();


        enumForCoffeemashine.makeBlackCoffee();
        enumForCoffeemashine.makeCoffeeWithCognac();
        enumForCoffeemashine.makeCongasWitoutCaffee();


    }
}
