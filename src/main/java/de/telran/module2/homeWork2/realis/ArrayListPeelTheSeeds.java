package de.telran.module2.homeWork2.realis;

import java.util.ArrayList;
import java.util.List;



public class ArrayListPeelTheSeeds {

    public static void main(String[] args) {
        // Найти сумму всех элементов ArrayList.
        ArrayList<Integer> numbers = new ArrayList<>();
        MetodsForArrayList metodsForArrayList = new MetodsForArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = metodsForArrayList.calculateSum(numbers);
        System.out.println("Сумма элементов: " + sum);

        //Перебрать ArrayList и вывести все элементы на экран.
        System.out.println();
        for (Integer el : numbers) {
            System.out.println(el);
        }

        //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Havrusha", 22),
                new Person("Stepan",38),
                new Person("Omeljan",45),
                new Person("Horpyna",18),
                new Person("Stasja",25),
                new Person("Halyna",33)

        ));
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("Havrusha", 22));
//        people.add(new Person("Stepan",38));
//        people.add(new Person("Omeljan",45));

        for (Person person : people){
            System.out.println(person);
        }

        System.out.println();

        //Перебрать ArrayList и найти наименьший элемент.

        // Нахождение наименьшего элемента
        int minElement = metodsForArrayList.findMinElement(numbers);

        // Вывод наименьшего элемента
        System.out.println("Наименьший элемент: " + minElement);

        System.out.println();

        //Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.

        // Определенная буква, с которой начинаются имена
        char targetLetter = 'H';

        // Подсчет людей, имена которых начинаются с определенной буквы
        int count = metodsForArrayList.countPeopleStartingWithLetter(people, targetLetter);

        // Вывод количества людей
        System.out.println("Количество людей, имена которых начинаются с буквы " + targetLetter + ": " + count);

        System.out.println();

        //Перебрать ArrayList и найти сумму квадратов всех элементов.

        // Нахождение суммы квадратов всех элементов

        int sumOfSquares = metodsForArrayList.calculateSumOfSquares(numbers);

        // Вывод результата
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);
        System.out.println();

        //Перебрать ArrayList и найти самую короткую строку.

        // Нахождение самой короткой строки в именах людей
        String shortestName = metodsForArrayList.findShortestName(people);

        // Вывод самой короткой строки
        System.out.println("Самое короткое имя: " + shortestName);
    }
}




