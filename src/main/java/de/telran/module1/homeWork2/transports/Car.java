package de.telran.module1.homeWork2.transports;

public class Car extends Motobice{
    String driver;

    @Override
    public String toString() {
        return "Car{" +
                "driver='" + driver + '\'' +
                "motor=" + motor +
                " frame='" + super.isFrame() + '\'' +
                ", whels=" + super.getWhels() +
                ", seats=" + super.getSeats() +
                '}';
    }
}
