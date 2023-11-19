package de.telran.homeWork2.animals;

import de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals.AnimalsOfNatur;
import de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals.Lion;
import de.telran.homeWork2.animals.animalsInNatur.predatoryAnimals.Tiger;
import de.telran.homeWork2.animals.homeAnimals.Cat;
import de.telran.homeWork2.animals.homeAnimals.Cow;
import de.telran.homeWork2.animals.homeAnimals.Dog;
import de.telran.homeWork2.animals.homeAnimals.HomeAnimal;
import de.telran.homeWork2.animals.Monkey.Chimpanzee;
import de.telran.homeWork2.animals.Monkey.Orangutan;
import de.telran.homeWork2.animals.Monkey.ZooAnimals;

public class ShowAnimal extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
        HomeAnimal homeAnimal = new HomeAnimal();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        ///////////////
        AnimalsOfNatur animalsOfNatur = new AnimalsOfNatur();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        ZooAnimals zooAnimals = new ZooAnimals();
        Chimpanzee chimpanzee = new Chimpanzee();
        Orangutan orangutan = new Orangutan();


        homeAnimal.setWhereLive("Live in Home");

        cat.setWhereLive("Live in Home");
        cat.setSpecies("Cat");

        cow.setSpecies("Cow");
        cow.setWhereLive("Live in Home");

        dog.setSpecies("Dog");
        dog.setWhereLive("Live in Home");

        ////////////

        animalsOfNatur.setWhereLive("Live in nature");
        zooAnimals.setWhereLive("Live in Zoo");


        lion.setSpecies("Lion");
        lion.setWhereLive("Live in nature");

        tiger.setSpecies("Tiger");
        tiger.setWhereLive("Live in nature");

        chimpanzee.setWhereLive("Live in Zoo");
        chimpanzee.setSpecies("Chimpanzee");

        orangutan.setWhereLive("Live in Zoo");
        orangutan.setSpecies("Orangutan");

        System.out.println(animal);
        System.out.println(homeAnimal);

        System.out.println(cat);
        cat.meow();

        System.out.println(cow);
        cow.drinkMilk();

        System.out.println(dog);
        dog.comeIfInAnything();
        ///////////

        System.out.println(lion);
        lion.EatsCats();
        System.out.println(tiger);
        tiger.EatsDogs();

        System.out.println(zooAnimals);

        System.out.println(chimpanzee);
        chimpanzee.getBanane();

        System.out.println(orangutan);
        orangutan.getOrange();

    }
}
