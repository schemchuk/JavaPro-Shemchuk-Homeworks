package de.telran.homeWork2.animals.homeAnimals;

public class Cow extends HomeAnimal{
    public String species;

    public void  drinkMilk(){
        System.out.println("Drink milk");
    }



    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cow{" +
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
