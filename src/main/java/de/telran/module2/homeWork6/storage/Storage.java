package de.telran.module2.homeWork6.storage;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Storage {
    public static void main(String[] args) {
        Queue<String> warehous = new LinkedList<>();
        warehous.add("Product");
        warehous.add("Product");
        warehous.add("Product");

        System.out.println(warehous);

        warehous.poll();
        System.out.println(warehous);
        warehous.poll();
        warehous.poll();
        warehous.poll();
        System.out.println(warehous);

    }
}
