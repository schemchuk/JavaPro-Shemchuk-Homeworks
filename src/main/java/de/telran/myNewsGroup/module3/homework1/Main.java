package de.telran.myNewsGroup.module3.homework1;

import java.io.PrintStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**
         *  Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
         */

        Map<Integer, String> jokesMap = new HashMap<>();
        jokesMap.put(1, "Joke1");
        jokesMap.put(2, "Joke2");
        jokesMap.put(3, "Joke3");
        jokesMap.put(4, "Joke4");
        jokesMap.put(5, "Joke5");
        jokesMap.put(6, "Joke1");


        Supplier<String> randomJoke = () -> {
            Random random = new Random();
            Integer[] keys = jokesMap.keySet().toArray(new Integer[0]);

            int randomIndex = random.nextInt(keys.length);
            Integer randomKey = keys[randomIndex];

            return jokesMap.get(randomKey);
        };
        String joke = String.valueOf(randomJoke.get());
        System.out.println("Anecdote of the day in our prison: " + joke);

        /**
         * Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.
         */

        Consumer<Integer> printNumber = (num) -> {

            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                System.err.println(num);
            }
        };
        printNumber.accept(-12);
        printNumber.accept(11);

        System.out.println("-------------------------------------");


        /**
         * Создать Predicate isWhiteCat, который проверяет, белого ли цвета кошка Cat.
         */

        Cat cat1 = new Cat("Red");
        Cat cat2= new Cat("White");
        Cat cat3 = new Cat("Black");

        Predicate<Cat> isColor = (color) -> Objects.equals(color.getColor(), "White");
        System.out.println(isColor.test(cat1));
        System.out.println(isColor.test(cat2));
        System.out.println(isColor.test(cat3));

        System.out.println("----------------------------");
        /**
         * Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
         */
        BiFunction<Integer,Integer,Integer> reiseToDegree = ((integer, integer2) -> {
            return (int) Math.pow(integer,integer2);
        });
        
                  int integer = 3;
                  int integer2 = 4;
                  int result = reiseToDegree.apply(integer,integer2);
        System.out.println(result);

        System.out.println("-----------------------------------------");
    }


}
