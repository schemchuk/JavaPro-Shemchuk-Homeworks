package de.telran.module2.HomeWork5.bank;

import java.util.Comparator;
import java.util.TreeSet;

public class BankDemo {
    public static void main(String[] args) {
        // класс для обслуживания клиентов
        TreeSet<Ticket> ticketSet = new TreeSet<>(Comparator.naturalOrder());

       // реестрация клиентов с выдачей номерков

       Ticket client1 = new Ticket("Гаврюша Обизянов", 1991,"Получение денежных средств",1);
        Ticket client2 = new Ticket("Шлема Гомельський",1975,"Вложение средств",2);
        Ticket client3 = new Ticket("Антон Довбищенко",1960,"Открытие депозита",3);
        Ticket client4 = new Ticket("Омелян Косогляд", 1950, "Комунальные платежи",4);
        Ticket client5 = new Ticket("Моисей Тот самый",-9345, "Консультация",5);

        // Добавляем клиентов в TreeSet
        ticketSet.add(client1);
        ticketSet.add(client2);
        ticketSet.add(client3);
        ticketSet.add(client4);
        ticketSet.add(client5);


        double realTime = 11;

        // Обслуживание клиентов
        for (Ticket ticket : ticketSet) {
            // Проверка условий для приоритетного обслуживания
            if (ticket.getOperationType().equals("Вложение средств") || ticket.getOperationType().equals("Открытие депозита")) {
                System.out.println("Обслуживание клиента с приоритетной операцией: " + ticket.getFullName());
            } else if (ticket.getDataBirth() <= 1957 && (10 <= realTime && realTime <= 12)) {
                System.out.println("Обслуживание клиента пенсионного возраста: " + ticket.getFullName());
            } else {
                System.out.println("Обслуживание клиента: " + ticket.getFullName());
            }
        }

    }
}
