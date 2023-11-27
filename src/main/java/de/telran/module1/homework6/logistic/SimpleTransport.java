package de.telran.module1.homework6.logistic;

public class SimpleTransport {
    public static void main(String[] args) {
        Carrier carrier = new Carrier();
        double maxPrice = 40.0;
        double maxDuration = 8.0;

        Transport foundTransport = carrier.findTransport(maxPrice, maxDuration, new BusFactory());
        //Transport foundTransport = carrier.findTransport(maxPrice, maxDuration, new TrainFactory());



        if (foundTransport != null) {
            System.out.printf("Transport: " + foundTransport.nameTransport() + " Price: " + foundTransport.getTicketPrice() + " Time: " + foundTransport.getTripDuration());
        } else  {
            System.out.printf("Будьте скромнее в своих желаниях");
        }
    }
}
