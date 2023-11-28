package de.telran.module1.homework6.logistic;

public class Train implements Transport{

    @Override
    public String nameTransport() {
        return "Train";
    }

    @Override
    public double getTicketPrice() {
        return 60;
    }

    @Override
    public double getTripDuration() {
        return 5;
    }
}