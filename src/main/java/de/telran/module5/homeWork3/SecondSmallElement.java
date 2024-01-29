package de.telran.module5.homeWork3;

import java.util.Arrays;

public class SecondSmallElement {
    public static void main(String[] args) {
        int[] array = {-1, 4, 0, 2, 7, -3};

        int secondSmallEl = findeSecondSmallEl(array);
        System.out.println("Second big element in array is: " + secondSmallEl);
    }

    static int findeSecondSmallEl(int[] array) {
        if(array.length < 2) {
            System.out.println("Array can has minimum two elements");
            return -1;
        }

        Arrays.sort(array);
        int secondSmollEl = array[1];
        return secondSmollEl;

    }
}
