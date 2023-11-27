package de.telran.module1.homework6.logistic;

public class BusFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
