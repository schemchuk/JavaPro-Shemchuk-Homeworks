package de.telran.myNewsGroup.module2.nomework6.customer.toHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Добавить для класса Customer возможность добавления в качестве ключа в  HashMap.
 * Проверить, правильно ли добавляется.
 */
public class SimpleCustomerHashMap {
    public static void main(String[] args) {

        HashMap<Customer,Integer> hashMap = new HashMap<>();

        hashMap.put(new Customer("Opanas","opanas@paraskaTrast.com", "Ukraine",300,true),1);
        hashMap.put(new Customer("Salomon","salomon@paraskaTrast.com", "Ukraine",300,true),2);
        hashMap.put(new Customer("Hryz","hryz@paraskaTrast.com", "Ukraine",300,true),3);

        System.out.println("Хеш мапа с ключом в виде клиента: ");
        for (Map.Entry<Customer,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
