package de.telran.module5.homeWork3;

import java.util.Arrays;

public class SecondBigElement {
    public static void main(String[] args) {

        int[] array = {-1, 4, 0, 2, 7, -3};

        int secondBig = findSecondBig(array);
        System.out.println("Second big element in array is: " + secondBig);
    }
    static int findSecondBig(int[] array) {
        if(array.length < 2) {
            System.out.println("Array can has minimum two elements");
            return -1;
        }
        Arrays.sort(array);
        int secondBigEl = array[array.length - 2];
        return secondBigEl;
    }

}

//Напишите программу на Java для поиска второго по величине элемента в массиве.
//example input:
//[-1, 4, 0, 2, 7, -3
