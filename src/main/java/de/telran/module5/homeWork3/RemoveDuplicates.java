package de.telran.module5.homeWork3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray ={0,3,-2,4,3,2};
        int[] resultArray = removeDuplicates(inputArray);

        System.out.print(" Input Array: ");
        printArray(inputArray, ", ");

        System.out.print("Array witout duplicates: ");
        printArray(resultArray, ", ");
    }


    static int[] removeDuplicates(int[] array) {

        List<Integer> unicalList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int val : array) {
            if (set.add(val)) {
                unicalList.add(val);
            }
        }
        int[] restArray = new int[unicalList.size()];
        for (int i = 0; i < unicalList.size(); i++) {
            restArray[i] = unicalList.get(i);
        }
        return restArray;
    }

    public static void printArray(int[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.println(str);
            }
        }
        System.out.println();
    }
}

//Напишите программу на Java для удаления повторяющихся элементов из массива.
//example input:
//[0,3,-2,4,3,2]
//
//example expected:
//[0,3,-2,4,2]