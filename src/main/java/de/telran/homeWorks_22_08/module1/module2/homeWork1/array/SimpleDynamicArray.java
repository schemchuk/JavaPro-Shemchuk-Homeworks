package de.telran.homeWorks_22_08.module1.module2.homeWork1.array;

import java.util.Iterator;

public class SimpleDynamicArray {
    public static void main(String[] args) {
        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        dynamicIntArray.add(12);
        dynamicIntArray.add(121);
        dynamicIntArray.add(123);
        dynamicIntArray.add(234);

        System.out.println(dynamicIntArray);

        Iterator<Integer> iterator = dynamicIntArray.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
