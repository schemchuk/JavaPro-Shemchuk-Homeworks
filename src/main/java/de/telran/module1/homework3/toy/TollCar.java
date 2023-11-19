package de.telran.module1.homework3.toy;

public class tollCar implements Toy, RemoteControl, Drive{
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
        System.out.println("I say brum-brum");
    }

    @Override
    public void remoteControl() {
        System.out.println("I work from a remote control");
    }

    @Override
    public void drive() {
        System.out.println(" I can drive");
    }
}
