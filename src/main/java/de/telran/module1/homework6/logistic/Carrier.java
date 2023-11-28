package de.telran.module1.homework6.logistic;

public class Carrier {
    public Transport findTransport(double maxPrice, double maxDuration, TransportFactory factory) {
        Transport transport = factory.createTransport();
        if (transport.getTicketPrice() <= maxPrice && transport.getTripDuration() <= maxDuration) {
            return transport;
        } else {
            return null;
        }
    }
}
//