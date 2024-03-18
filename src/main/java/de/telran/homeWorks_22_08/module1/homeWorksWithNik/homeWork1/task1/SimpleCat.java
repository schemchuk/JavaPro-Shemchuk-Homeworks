package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task1;

public class SimpleCat {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat(2.5,true);
        Cat cat2 = new Cat(4.2,false);
        Cat cat3 = new Cat(1.0,true);
        Cat cat4 = new Cat(3.8,true);
        Cat cat5 = new Cat(4.5,true);

        cat1.printCatWeight();
        cat2.printCatWeight();
        cat3.printCatWeight();
        cat4.printCatWeight();
        cat5.printCatWeight();

        cat1.feed();
        cat2.feed();

        cat3.meowToDeath();
    }
}
