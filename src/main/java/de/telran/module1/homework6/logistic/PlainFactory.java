package de.telran.module1.homework6.logistic;

public abstract class PlainFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Plain();
    }
}
