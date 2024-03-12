package de.telran.homeWorks_22_08.module1.homework6.logistic;

public class BusFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
//
