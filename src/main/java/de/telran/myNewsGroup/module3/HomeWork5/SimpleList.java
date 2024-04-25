package de.telran.myNewsGroup.module3.HomeWork5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SimpleList {
    /**
     * Имеется два списка элементов.
     * List list1 = Arrays.asList(1, 2, 3, 5, 5);
     * List list2 = Arrays.asList(4, 5, 6, 1);
     * С помощью flatmap:
     * a). Получить все возможные значения произведения чисел из обоих списков
     * b). Получить все возможные повторяющиеся пары чисел из обоих списков [1, 1] [5, 5]
     * с). Найти все пары чисел, которые делятся друг на друга [2, 4] [3, 6] [5, 1]
     */

    public static void main(String[] args) {
        //  С помощью flatmap:
        //a). Получить все возможные значения произведения чисел из обоих списков
        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 1);

        List<Integer> ProduckCollect = list1.stream()
                .flatMap(x -> list2.stream()
                        .map(y -> x * y))
                .toList();
        System.out.println(ProduckCollect);

        //     * b). Получить все возможные повторяющиеся пары чисел из обоих списков [1, 1] [5, 5]
//        List<int[]> listTheSame = list1.stream()
//                .flatMap(x -> list2.stream()
//                        .map(y -> new int[]{x,y})
//                        .map(p -> Arrays.toString(p))
//                .collect(Collectors.toList());

        List<String> duplicatePairs = list1.stream()
                .flatMap(x -> list2.stream()
                        .filter(y  -> Objects.equals(x, y))
                        .map(y -> new int[]{x, y}))
                .map(p -> Arrays.toString(p))
                .collect(Collectors.toList());

        System.out.println(duplicatePairs);
        //     * с). Найти все пары чисел, которые делятся друг на друга [2, 4] [3, 6] [5, 1]

        List<String> divPaar = list1.stream()
                .flatMap(x -> list2.stream()
                        .filter(y -> x % y == 0)
                        .map(y -> new int[]{x, y}))
                .map(p -> Arrays.toString(p))
                .toList();
        System.out.println(divPaar);



    }


}

