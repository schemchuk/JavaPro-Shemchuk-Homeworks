package de.telran.homeWorks_22_08.module1.homework3.toy;

public class LoocToy {
    public static void main(String[] args) {
        Doll doll = new Doll();
        doll.saveForChild();
        doll.play();
        doll.maceSound();

        TollCar tollCar = new TollCar();
        tollCar.saveForChild();
        tollCar.play();
        tollCar.maceSound();
        tollCar.remoteControl();
        tollCar.drive();

        Plane plane = new Plane();
        plane.saveForChild();
        plane.play();
        plane.maceSound();
        plane.remoteControl();
        plane.fly();

        Cutter cutter = new Cutter();
        cutter.saveForChild();
        cutter.play();
        cutter.maceSound();
        cutter.remoteControl();
        cutter.shwimm();
    }

}
