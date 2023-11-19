package de.telran.homeWork2.animals.Monkey;

import de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals.AnimalsOfNatur;

public class ZooAnimals extends AnimalsOfNatur {
    public String  whereLive;

    @Override
    public void setWhereLive(String whereLive) {
        this.whereLive = whereLive;
    }

    @Override
    public String toString() {
        return "ZooAnimals{" +
                ", whereLive='" + whereLive + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
