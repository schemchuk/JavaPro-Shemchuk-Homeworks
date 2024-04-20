package de.telran.myNewsGroup.module3.homeWork4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exsample1 {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Opanas", "Salomon", "Tom", "Omelyan", "tom", "Havrusha", "Salomon", "Omelyan", "Hryz","Benya", "Tom");
        // - Посчитать количество неповторяющихся слов в списке

        Map<String, Long> wordCounts = myList.stream()
                .collect(Collectors.groupingBy(s -> s.toLowerCase(), Collectors.counting()));
        System.out.println(wordCounts);

        Set<String> uniqueSet = wordCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(ennry -> ennry.getKey())
                .collect(Collectors.toSet());

        System.out.println("Количество неповторяющихся слов: " + uniqueSet.size());

        //    - Посчитать количество людей с именем "Tom" в списке имен
        int countTom = (int) myList.stream()
                .filter(s -> s.toLowerCase().contains("tom"))
                .count();
        System.out.println("количество повторений имени Tom " + countTom);

        //    - Из списка имен вывести первое по алфавиту, предпоследнее по алфавиту
        String firtsName = myList.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .findFirst()
                .orElse("Список пуст");

        String beforLast = myList.stream()
                .sorted(Comparator.comparing(s -> s.toLowerCase()))
                .skip(myList.size() - 2)
                .findFirst()
                .orElse("Список пуст");

        System.out.println("Первое имя в списке по алфавиту: " + firtsName + " , предпоследнее: " + beforLast);


        //    - Посчитать количество чисел от 1 до 1000, которые делятся на 7.

        int nunberDiviibleBySeven = (int) IntStream.range(1, 1000)
                .filter(n -> n % 7 == 0)
                .count();
        System.out.println("Количество чисел в заданом условии составляет: " + nunberDiviibleBySeven);

        //    - Посчитать сумму квадратов чисел от 1 до 100
        int sumOfSquares = IntStream.range(1,100)
                .map(x -> x * x)
                .sum();
        System.out.println("Сумма квадратов чисел от одного до ста составляет: " + sumOfSquares);
        //    - Проверить, все ли числа из списка четные
        List<Integer> list = Arrays.asList(2,4,6,8,11,12);

        long countCouples = list.stream()
                .filter(x -> x % 2 == 0)
                .count();
        if (countCouples == list.size()){
            System.out.println("В списке  все числа парные");
        }else {
            System.out.println("В списке не все числа парные");
        }

    }
}
