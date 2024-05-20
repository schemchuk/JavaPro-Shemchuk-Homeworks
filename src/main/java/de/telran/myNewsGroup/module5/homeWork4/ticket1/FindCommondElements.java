package de.telran.myNewsGroup.module5.homeWork4.ticket1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommondElements {
    /**
     * Напишите метод и тест для него для поиска общих элементов между двумя массивами целых чисел
     * example input:
     * Array1: [1, 2, 5, 5, 8, 9, 7, 10]
     * <p>
     * Array2: [1, 0, 6, 15, 6, 4, 7, 0]
     * <p>
     * example expected:
     * [1,7]
     *
     */

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();

        for (int num : arr1) {
            set.add(num);
        }

            for (int num : arr2) {
                if (set.contains(num)) {
                    commonElements.add(num);
                }
            }
        return commonElements;
    }
}

