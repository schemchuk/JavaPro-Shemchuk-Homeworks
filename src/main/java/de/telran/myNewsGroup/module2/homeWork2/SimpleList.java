package de.telran.myNewsGroup.module2.homeWork2;

import java.util.LinkedList;

public class SimpleList {
    public static void main(String[] args) {
        MyList myList = new MyList();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Je");
        linkedList.add("mehr");
        linkedList.add("desto");
        linkedList.add("Besser");

        /**
         * . Перебрать LinkedList и найти самую короткую строку.
         */
        System.out.println("Shortes string is: " + myList.findShortString(linkedList));

        System.out.println("--------------------------------");

        /**
         * Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
         */
        System.out.println(myList.combinateTerms(linkedList));

        System.out.println("--------------------------------");

        /**
         * Создать LinkedList с объектами вашего собственного класса и
         * удалить все элементы, удовлетворяющие определенному условию.
         */

      LinkedList<Dog> dogs = new LinkedList<>();
      dogs.add(new Dog("Kulko", 3));
      dogs.add(new Dog("Reks", 5));
      dogs.add(new Dog("Miranda", 1));
      dogs.add(new Dog("Bobik", 8));
      dogs.add(new Dog("Salomon", 1));

        System.out.println("Список собак до удаления: ");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Dog.removeDogByAde(dogs,1);

        System.out.println("Список собак после удаления: ");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("-------------------");

        /**
         * Напишите метод, чтобы получить первое и последнее вхождение указанных элементов в связанном списке.
         * input:
         * list = {1, 4, 3, 2, 1, 2, 2, 0}, element = 2
         * output:
         * 3 (индекс первого вхождения), 6 (индекс последнего вхождения
         */

        FindElements findElements = new FindElements();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(0);

        int element = 2;

        int firstIndex = FindElements.findFirstIndex(list, element);
        int lastIndex = FindElements.findLastIndex(list, element);

        System.out.println("Первое вхождение елемента " + element + " Зафиксировано по индексу " + firstIndex);
        System.out.println("Последнее вхождение элемента " + element + " Зафиксировано по индексу " + lastIndex);
    }
}
