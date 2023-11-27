package de.telran.module1.homework6.logistic;

public class TrainFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
