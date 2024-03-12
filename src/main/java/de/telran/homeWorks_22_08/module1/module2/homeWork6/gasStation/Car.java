package de.telran.homeWorks_22_08.module1.module2.homeWork6.gasStation;

public class Car implements Comparable<Car> {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type ;
    }

    @Override
    public int compareTo(Car o) {
        if (this.type.equals("KrankenKarete")) {
            return -1; // isPriopy
        } else if (this.type.equals("PublikBus")) {
            if (o.getType().equals("KrankenKarete")) {
                return 0; // "KrankenKarete" is Priory;
            } else {
                return -1; // PublikBus isPriory besiges KrankenKarete
            }
        } else {
            return 1;
        }
    }
}

//        && !o.getType().equals("KrankenKarete")) {
//        return -1; // isPriory besiges "KrankenKarete";