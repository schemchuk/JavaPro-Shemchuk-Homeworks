package de.telran.homeWorks_22_08.module1.homeWork2.animals.animalsInNatur.predatoryAnimals;

import de.telran.homeWorks_22_08.module1.homeWork2.animals.Animal;

public class AnimalsOfNatur extends Animal {
    public String  whereLive;

    public void setWhereLive(String whereLive) {
        this.whereLive = whereLive;
    }

    @Override
    public String toString() {
        return "AnimalsOfNatur{" +
                "whereLive='" + whereLive + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
