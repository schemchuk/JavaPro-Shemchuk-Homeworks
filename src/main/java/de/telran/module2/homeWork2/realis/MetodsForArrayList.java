package de.telran.module2.homeWork2.realis;

import java.util.ArrayList;
import java.util.LinkedList;

public class MetodsForArrayList {
    //Находим сумму всех елементов ArrayList
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    // Метод для нахождения наименьшего элемента в ArrayList
    public static int findMinElement(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }

        int minElement = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int currentElement = list.get(i);
            if (currentElement < minElement) {
                minElement = currentElement;
            }
        }

        return minElement;
    }

    // Метод для подсчета людей, имена которых начинаются с определенной буквы в ArrayList
    public static int countPeopleStartingWithLetter(ArrayList<Person> list, char letter) {
        int count = 0;

        for (Person person : list) {
            if (person.getName().charAt(0) == Character.toUpperCase(letter) || person.getName().charAt(0) == Character.toLowerCase(letter)) {
                count++;
            }
        }

        return count;
    }

    // Метод для нахождения суммы квадратов элементов в ArrayList
    public static int calculateSumOfSquares(ArrayList<Integer> list) {
        int sumOfSquares = 0;

        for (int number : list) {
            sumOfSquares += number * number;
        }

        return sumOfSquares;
    }


    // Метод для нахождения самой короткой строки в именах людей
    public static String findShortestName(ArrayList<Person> list) {
        if (list.isEmpty()) {
            return null; // Возвращаем null в случае пустого списка
        }

        String shortestName = list.get(0).getName();

        for (Person person : list) {
            if (person.getName().length() < shortestName.length()) {
                shortestName = person.getName();
            }
        }

        return shortestName;
    }

}
