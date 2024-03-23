package de.telran.myNewsGroup.module2.homeWork4;

import java.util.TreeSet;

public class SimplTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(21);
        myTreeSet.add(2);
        myTreeSet.add(3);
        myTreeSet.add(4);
        myTreeSet.add(5);
        myTreeSet.add(6);
        myTreeSet.add(7);
        myTreeSet.add(8);
        myTreeSet.add(10);
        myTreeSet.add(12);
        myTreeSet.add(1);

        System.out.println(myTreeSet);
        /**
         * Найти заданное число 10
         */
        int numberToFind = 10;
        if (myTreeSet.contains(numberToFind)) {
            System.out.println("Число " + numberToFind + " присутствует в коллекции");
        } else {
            System.out.println("Число " + numberToFind + " otсутствует в коллекции");
        }
        /**
         * Найти самое большое Число
         */
        int bigNumber = myTreeSet.last();
        System.out.println("самое болшое число коллекции " + bigNumber);

        /**
         * Найти  самое маленькое число
         */
        int shortNumber = myTreeSet.first();
        System.out.println("самое маленькое число коллекции " + shortNumber);

        /**
         * Вывести все четные числа
         */

        System.out.println("список всех четные числа : ");
        for (int number : myTreeSet) {
            if (number % 2 == 0) {
                System.out.print(number + ", ");
            }
        }
        System.out.println();

        /**
         * Получить список всех чисел в обратном порядке
          */
        System.out.println("список всех чисел в обратном порядке: " + myTreeSet.reversed());

        /**
         * Получить список всех чисел меньше 7
         */
        System.out.println("список всех чисел меньше 7: ");
        for (int num : myTreeSet) {
            if (num < 7){
                System.out.print(num + ", ");
            }
        }
    }
}
