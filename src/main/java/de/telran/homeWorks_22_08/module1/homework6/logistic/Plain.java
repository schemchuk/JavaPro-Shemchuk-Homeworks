package de.telran.homeWorks_22_08.module1.homework6.logistic;

public class Plain implements Transport{
    @Override
    public String nameTransport() {
        return "Plain";
    }

    @Override
    public double getTicketPrice() {
        return 150;
    }

    @Override
    public double getTripDuration() {
        return 1;
    }
}

