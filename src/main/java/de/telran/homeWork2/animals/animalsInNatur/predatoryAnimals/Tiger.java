package de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals;

public class Tiger extends AnimalsOfNatur {
    public String species;

    public void EatsDogs() {
        System.out.println("I'm eat dogs");
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    @Override
    public String toString() {
        return "Tiger{" +
                "species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
