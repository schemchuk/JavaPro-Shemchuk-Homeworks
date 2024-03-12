package de.telran.homeWorks_22_08.module1.module2.homeWork6.storage2;

import java.util.ArrayDeque;

public class Warehous {
    public static void main(String[] args) {
        // методы добавления
        ArrayDeque<String> storage = new ArrayDeque<>();
//       storage.add("Product1");
//        storage.addFirst("Product2");
//        storage.addLast("Product3");
//        storage.push("Product4");
//        storage.add("Product5");
//
//        //методи извлечения
//
//        storage.poll();
//        storage.pollFirst();
//        storage.pollLast();
//        storage.pop();
//        //-----------
//        storage.removeFirst();
//        storage.removeLast();
    // Работа склада с кирпичами

        storage.add("Product");
        storage.add("Product");
        storage.add("Product3");
        System.out.println(storage);

        storage.pollLast();

        System.out.println(storage);
        storage.pollLast();
        storage.pollLast();
        storage.pollLast();

        System.out.println(storage);
    }

}
