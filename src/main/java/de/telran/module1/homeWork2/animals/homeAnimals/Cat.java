package de.telran.module1.homeWork2.animals.homeAnimals;

public class Cat extends HomeAnimal{
    public String species;

    public void meow() {
        System.out.println("Meow");
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    @Override
    public String toString() {
        return "Cat{" +
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
