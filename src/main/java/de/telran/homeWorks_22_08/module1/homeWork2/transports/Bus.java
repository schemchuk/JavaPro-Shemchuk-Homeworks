package de.telran.homeWorks_22_08.module1.homeWork2.transports;

public class Bus extends Car{
    String assistentDriver;
    private String reisName;

    //Создал геттер и сеттер для названия рейса

    public void setReisName(String reisName) {
        this.reisName = reisName;
    }

    public String getReisName() {
        return reisName;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "assistentDriver=' " + assistentDriver + '\'' +
                ", reisName=' " + reisName + '\'' +
                "driver=' " + driver + '\'' +
                " motor=" + motor +
                " frame='" + super.isFrame() + '\'' +
                ", whels=" + super.getWhels() +
                ", seats=" + super.getSeats() +
                '}';
    }
}
