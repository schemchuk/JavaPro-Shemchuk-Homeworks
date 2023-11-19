package de.telran.homeWork2.transports;

public class SimpleTransports {

    public static void main(String[] args) {
        Bicikle bicikle = new Bicikle();
        Motobice  motobice = new Motobice();
        Car car = new Car();
        Bus bus = new Bus();

        bicikle.setWhels(2);
        bicikle.setSeats(1);

        motobice.setSeats(2);
        motobice.setWhels(3);

        car.driver = "Omeljan";
        car.setSeats(5);
        car.setWhels(4);

        bus.setWhels(6);
        bus.setSeats(48);
        bus.driver = "Stepan Sraka";
        bus.assistentDriver = "Havrusha Obizjanov";
        bus.setReisName("Vorochta - Los Angelos");

        System.out.println(bicikle);
        System.out.println(motobice);
        System.out.println(car);
        System.out.println(bus);
    }

}
