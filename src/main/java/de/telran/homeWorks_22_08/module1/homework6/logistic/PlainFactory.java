package de.telran.homeWorks_22_08.module1.homework6.logistic;

public abstract class PlainFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Plain();
    }
}
//