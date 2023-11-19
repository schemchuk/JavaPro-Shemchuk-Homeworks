package de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals;

public class Lion extends AnimalsOfNatur {
    public String species;

    public void EatsCats() {
        System.out.println("I'm eat cats");
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
