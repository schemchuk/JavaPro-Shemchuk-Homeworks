package de.telran.homeWorks_22_08.module1.homeWork2.transports;

public class Motobice extends Bicikle {
    boolean motor = true;

    @Override
    public String toString() {
        return "Motobice{" +
                "motor=" + motor +
                " frame='" + super.isFrame() + '\'' +
                ", whels=" + super.getWhels() +
                ", seats=" + super.getSeats() +
                '}';
    }
}
