package de.telran.homeWorks_22_08.module1.lecture1.module1.lecture1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Omeljan",18);

        Phone nokia = new Phone("+491234", "4610", 321);
        Phone iphome = new Phone("+348576940", "4845095", 431);
        Phone samsung = new Phone("+38540554745095", "4589", 398);
        Phone[] arr = {samsung, nokia, iphome};
        for (Phone phone : arr) {

        System.out.println(phone.model + " " + phone.number + " "  + phone.weight);
        }
        for (Phone phone : arr) {
        phone.receiveCall("Omeljan");
            System.out.println("Number: " + phone.getNumber());

        }

    }

}
