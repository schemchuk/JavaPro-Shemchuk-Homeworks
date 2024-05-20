package de.telran.myNewsGroup.module5.homeWork4.ticket2;

import java.util.*;

public class RemoveDuplicates {
    /**
     * Напишите метод и тест для него для удаления повторяющихся элементов из массива.
     * example input:
     * [0,3,-2,4,3,2]
     * <p>
     * example expected:
     * [0,3,-2,4,2]
     *
     */
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqList = new ArrayList<>();

        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);
                uniqList.add(num);
            }
        }



        int[] result = new int[uniqList.size()];

        for (int i = 0; i < uniqList.size(); i++) {
            result[i] = uniqList.get(i);
        }
        return result;
    }

}
