package de.telran.module1.homeWork5.coffeeAutomat;

public enum EnumForCoffeemashine {
    INSTANCE;
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
