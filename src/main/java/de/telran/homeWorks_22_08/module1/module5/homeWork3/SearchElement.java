package de.telran.homeWorks_22_08.module1.module5.homeWork3;

import java.util.HashSet;
import java.util.Set;

public class SearchElement {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        int[] result = SearchElement.findRecesElements(array1, array2);

        System.out.print("Recurring Elements: ");
        for (int num : result) {
            System.out.print(num + ", ");
        }
    }

    static int[] findRecesElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] resultArray = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            resultArray[index++] = num;
        }

        return resultArray;
    }
}

//Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
//example input:
//Array1: [1, 2, 5, 5, 8, 9, 7, 10]
//
//Array2: [1, 0, 6, 15, 6, 4, 7, 0]
//
//example expected:
//[1,7]

