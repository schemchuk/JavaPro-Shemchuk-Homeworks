package de.telran.homeWorks_22_08.module1.homework3.toy;

public class Cutter implements Toy, RemoteControl, Shwimm {
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
        System.out.println("I'm ready to shwimm");
    }

    @Override
    public void remoteControl() {
        System.out.println("I work from a remote control");
    }


    @Override
    public void shwimm() {
        System.out.println("I can shwimen");
    }
}

