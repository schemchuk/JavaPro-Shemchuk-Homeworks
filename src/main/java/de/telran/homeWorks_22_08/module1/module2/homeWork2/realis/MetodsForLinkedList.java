package de.telran.homeWorks_22_08.module1.module2.homeWork2.realis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MetodsForLinkedList {
    // Метод для вычисления среднего значения элементов LinkedList
    public static double calculateAverage(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int number : list) {
            sum += number;
        }

        return (double) sum / list.size();
    }

    // Метод для поиска самой длинной строки в LinkedList
    public static String findLongestString(LinkedList<String> list) {
        if (list.isEmpty()) {
            return null; // Возвращаем null в случае пустого списка
        }

        ListIterator<String> iterator = list.listIterator();
        String longestString = iterator.next(); // Предполагаем, что первая строка самая длинная

        while (iterator.hasNext()) {
            String currentString = iterator.next();
            if (currentString.length() > longestString.length()) {
                longestString = currentString;
            }
        }

        return longestString;
    }

    // Метод для нахождения наибольшего элемента в LinkedList
    public static int findMaxElement(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }

        ListIterator<Integer> iterator = list.listIterator();
        int maxElement = iterator.next();

        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (currentElement > maxElement) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }

    // Метод для нахождения первого вхождения строки в LinkedList
    public static int findFirstOccurrence(LinkedList<String> list, String target) {
        ListIterator<String> iterator = list.listIterator();
        int index = 0;

        while (iterator.hasNext()) {
            String currentString = iterator.next();
            if (currentString.equals(target)) {
                return index;
            }
            index++;
        }

        return -1; // Возвращает -1, если строка не найдена
    }


    // Метод для удаления элементов, удовлетворяющих условию, из LinkedList
    public static void removeElementsBelowAge(LinkedList<Person> list, int threshold) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() < threshold) {
                iterator.remove();
            }
        }
    }

    // Метод для вычисления произведения всех элементов в LinkedList
    public static int calculateProduct(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Если список пуст, возвращаем 0 (или можно выбрать другое начальное значение)
        }

        ListIterator<Integer> iterator = list.listIterator();
        int product = 1; // Используем 1 в качестве начального значения, так как умножение на 0 всегда дает 0

        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            product *= currentNumber;
        }

        return product;
    }
}
