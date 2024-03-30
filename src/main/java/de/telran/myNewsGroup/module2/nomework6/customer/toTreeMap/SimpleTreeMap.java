package de.telran.myNewsGroup.module2.nomework6.customer.toTreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Добавить для класса Customer возможность добавления в качестве ключа в TreeMap.
 * Проверить, правильно ли добавляется.
 */
public class SimpleTreeMap {
    public static void main(String[] args) {
        TreeMap<Customer,Integer> treeMap = new TreeMap<>();

        treeMap.put(new Customer("Opanas","opanas@paraskaTrast.com", "Ukraine",300,true),1);
        treeMap.put(new Customer("Salomon","salomon@paraskaTrast.com", "Ukraine",300,true),2);
        treeMap.put(new Customer("Hryz","hryz@paraskaTrast.com", "Ukraine",300,true),3);


        System.out.println("Три мапа с ключом в виде клиента: ");
        for (Map.Entry<Customer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
