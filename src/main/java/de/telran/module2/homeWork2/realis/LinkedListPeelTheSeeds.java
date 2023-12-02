package de.telran.module2.homeWork2.realis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static de.telran.module2.homeWork2.realis.MetodsForLinkedList.calculateAverage;

public class LinkedListPeelTheSeeds {
    public static void main(String[] args) {
        MetodsForLinkedList metodsForLinkedList = new MetodsForLinkedList();
        LinkedList<Integer> numbers = new LinkedList<>(List.of(1,2,3,4,5,6));
        double average = calculateAverage(numbers);
        System.out.println("Среднее значение элементов: " + average);

        System.out.println();

        //Перебрать LinkedList и найти самую длинную строку.
        LinkedList<String> strings = new LinkedList<>(List.of("Omeljan","Anton","Stepan","Havrusha"));
        String longestString = metodsForLinkedList.findLongestString(strings);
        System.out.println("Самая длинная строка: " + longestString);

        System.out.println();

        //Перебрать LinkedList и найти наибольший элемент.

        // Нахождение наибольшего элемента
        int maxElement = metodsForLinkedList.findMaxElement(numbers);

        // Вывод наибольшего элемента
        System.out.println("Наибольший элемент: " + maxElement);

        System.out.println();

       // Перебрать LinkedList и найти первое вхождение определенной строки.

        strings.add("Stepan");
        strings.add("Horpyna");

        // Определенная строка, которую мы ищем
        String targetString = "Stepan";

        // Нахождение первого вхождения строки
        int index = metodsForLinkedList.findFirstOccurrence(strings, targetString);

        // Вывод результата
        if (index != -1) {
            System.out.println("Первое вхождение строки '" + targetString + "' находится в позиции " + index);
        } else {
            System.out.println("Строка '" + targetString + "' не найдена в списке");
        }

        System.out.println();

      //  Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

        LinkedList<Person> people = new LinkedList<>(List.of(
                new Person("Havrusha", 22),
                new Person("Stepan",38),
                new Person("Omeljan",45),
                new Person("Horpyna",18),
                new Person("Stasja",25),
                new Person("Halyna",33)

        ));

        // Условие для удаления: возраст меньше 30
        int ageThreshold = 30;

        // Удаление элементов, удовлетворяющих условию
        metodsForLinkedList.removeElementsBelowAge(people, ageThreshold);

        // Вывод оставшихся элементов
        System.out.println("Оставшиеся элементы:");
        for (Person person : people) {
            System.out.println(person);
        }

        //Перебрать LinkedList и вычислить произведение всех элементов.

        // Вычисление произведения всех элементов
        int product = metodsForLinkedList.calculateProduct(numbers);

        // Вывод результата
        System.out.println("Произведение всех элементов: " + product);
        System.out.println();

        //Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.

    }
}

