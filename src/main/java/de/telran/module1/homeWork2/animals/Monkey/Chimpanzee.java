package de.telran.module1.homeWork2.animals.Monkey;

import de.telran.module1.homeWork2.animals.animalsInNatur.predatoryAnimals.AnimalsOfNatur;

public class Chimpanzee extends AnimalsOfNatur {
    public String species;


    public void  getBanane(){
        System.out.println("Get Banane");
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "species='" + species + '\'' +
                ", whereLive='" + whereLive + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
