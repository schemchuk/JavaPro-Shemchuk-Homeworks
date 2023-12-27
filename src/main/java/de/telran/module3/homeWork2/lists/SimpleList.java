package de.telran.module3.homeWork2.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleList {
    public static void main(String[] args) {
        //Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".

        List<String> strings =  Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long count = strings.stream()
                .filter(n -> n.contains("Big"))
                .count();
        System.out.println("Object Big okkurts: " + count + " times");
        System.out.println("-------------------------");

        // Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")

        List<String> strings1 = Arrays.asList("a1", "b5", "a2", "b4");

        int minWalue = strings1.stream()
                .map(s -> Integer.parseInt(s.substring(1)))
                .min(Integer::compare)
                .orElseThrow();
        System.out.println("min element is: " + minWalue);
        System.out.println("-------------------------");

        // Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
        //Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> strings2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> result = strings2.stream()
                .sorted((s1,s2) -> s2.compareTo(s1))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("New List witout duplikates is: " + result);

    }
}
