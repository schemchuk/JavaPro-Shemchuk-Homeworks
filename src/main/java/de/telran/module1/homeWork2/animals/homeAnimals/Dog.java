package de.telran.module1.homeWork2.animals.homeAnimals;

public class Dog extends HomeAnimal{
    public String species;

    public void  comeIfInAnything(){
        System.out.println("Заходи если что");
    }



    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Dog{" +
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
