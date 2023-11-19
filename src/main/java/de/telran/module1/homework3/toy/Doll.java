package de.telran.module1.homework3.toy;

public class Doll implements Toy{
    @Override
    public void saveForChild() {
        System.out.println("I'm a save toy");
    }

    @Override
    public void play() {
        System.out.println("I'm plauing with you");
    }

    @Override
    public void maceSound() {
        System.out.println("I say mom");
    }

}

