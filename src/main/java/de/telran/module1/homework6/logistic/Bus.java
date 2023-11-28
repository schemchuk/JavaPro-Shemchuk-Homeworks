package de.telran.module1.homework6.logistic;

public class Bus implements Transport {
    @Override
    public String nameTransport() {
        return "Bus";
    }

    @Override
    public double getTicketPrice() {
        return 20.0;
    }

    @Override
    public double getTripDuration() {
        return 8.0;
    }
}

//


