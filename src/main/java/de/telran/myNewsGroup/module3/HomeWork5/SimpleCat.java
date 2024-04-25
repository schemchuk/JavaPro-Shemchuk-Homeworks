package de.telran.myNewsGroup.module3.HomeWork5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "black", 2);
        Cat cat2 = new Cat("Mikky", "white", 1);
        Cat cat3 = new Cat("Vasya", "white", 3);
        Cat cat4 = new Cat("Steve", "grey", 1);
        Cat cat5 = new Cat("Bob", "black", 5);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);
//        - Получить Map<String, String> имя / цвет

        Map<String, String> getNameToColorMap = catList.stream()
                .collect(Collectors.toMap(
                        cat -> cat.getName(),
                        cat -> cat.getColor()
                ));
        System.out.println(getNameToColorMap);
//                - Получить Map<String, Long> цвет / количество кошек данного цвета

        Map<String, Long> countToColorMap = catList.stream()
                .collect(Collectors.groupingBy(
                        cat -> cat.getColor(),
                        Collectors.counting()
                ));

        System.out.println(countToColorMap);
//        - Получить Map<String, Set<String>> цвет / список имен кошек данного цвета

       Map<String, Set<String>> colorToNameSetMap = catList.stream()
                .collect(Collectors.groupingBy(
                        cat -> cat.getColor(),
                        Collectors.mapping(
                                cat -> cat.getName(),
                                Collectors.toSet()
                        )
                ));
        System.out.println(colorToNameSetMap);
//                - Получить Map<Integer, Integer> возраст / количество белых кошек данного возраста

        Map<Integer, Integer> ageWhiteCatsCountMap = catList.stream()
                .filter(cat -> cat.getColor().equals("white"))
                .collect(Collectors.groupingBy(
                        cat -> cat.getAge(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)

                ));
        System.out.println(ageWhiteCatsCountMap);
    }
}
