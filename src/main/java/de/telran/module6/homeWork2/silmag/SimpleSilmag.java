package de.telran.module6.homeWork2.silmag;

import java.util.Scanner;

public class SimpleSilmag {
    public static void main(String[] args) {

//Внимание!!! Магазин работает круглосуточно!!!
        // цикл бесконечный
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество товаров на полках: ");
        int shelfCapacity = scanner.nextInt();


        ThreadInteraction silmagInteraction = new ThreadInteraction(shelfCapacity);

        Supplier supplier = new Supplier(silmagInteraction);

        Customer customer1 = new Customer(silmagInteraction, "Customer 1");
        Customer customer2 = new Customer(silmagInteraction, "Customer 2");
        Customer customer3 = new Customer(silmagInteraction, "Customer 3");

        Thread supplierThread = new Thread(supplier, "Supplier");
        Thread customerThread1 = new Thread(customer1, "Customer 1");
        Thread customerThread2 = new Thread(customer2, "Customer 2");
        Thread customerThread3 = new Thread(customer3, "Customer 3");

        supplierThread.start();
        customerThread1.start();
        customerThread2.start();
        customerThread3.start();
    }
}

//Есть Магазин, на котором может одновременно разместиться ограниченное количество товара
// (для примера можно взять 3 единицы, а лучше попросить пользователя ввести количество).
//За один раз Поставщик может привезти 1 шт. товара.
//Покупатель тоже может приобрести только 1 шт. товара.
//Напишите программу, которая позволит Покупателям приобретать товар и нужно сделать так, чтобы полки магазина не пустовали ;)
//Используйте wait / notify механизм многопоточности. Поставщик и Покупатель/ли - это разные потоки.
