package de.telran.homeWorks_22_08.module1.module2.homeWork6.gasStation;

import java.util.PriorityQueue;

public class SimpleCasStation {
    public static void main(String[] args) {
        PriorityQueue<Car> casStation = new PriorityQueue<>();
        casStation.offer(new Car("Car1"));
        casStation.offer(new Car("Bus2"));
        casStation.offer(new Car("Bus1"));
        casStation.offer(new Car("KrankenKarete"));
        casStation.offer(new Car("PublikBus"));
        casStation.offer(new Car("Car2"));

        while (!casStation.isEmpty()) {
            Car nexstCar = casStation.poll();
            System.out.println("Взят на обслуживание автомобиль: " + nexstCar);
        }




    }
}
