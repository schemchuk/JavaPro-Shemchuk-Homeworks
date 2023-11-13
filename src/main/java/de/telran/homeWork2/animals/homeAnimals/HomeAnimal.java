package de.telran.homeWork2.animals.homeAnimals;

import de.telran.homeWork2.animals.Animal;

public class HomeAnimal extends Animal {
    String  whereLive;

    public void setWhereLive(String whereLive) {
        this.whereLive = whereLive;
    }

    public String getWhereLive() {
        return whereLive;
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "whereLive='" + whereLive + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
