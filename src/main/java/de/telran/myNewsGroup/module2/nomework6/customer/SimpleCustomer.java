package de.telran.myNewsGroup.module2.nomework6.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCustomer {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Opanas", "opanas@paraskaTrast.com", "Ukraine", 300, true));
        customers.add(new Customer("Omelyan", "omelyan@paraskaTrast.com", "Ukraine", 300, true));
        customers.add(new Customer("Semen", "semen@paraskaTrast.com", "Ukraine", 300, true));
        customers.add(new Customer("Salomon", "salomon@paraskaTrast.com", "Germany", 200, true));
        customers.add(new Customer("John", "john@paraskaTrast.com", "USA", 100, true));
        customers.add(new Customer("Bob", "bob@paraskaTrast.com", "Canada", 100, false));

        /**
         * . Получить Map email / страна
         */
        Map<String, String> emailToCountryMap = new HashMap<>();
        for (Customer customer : customers) {
            emailToCountryMap.put(customer.getEmail(),customer.getCountry());
        }
        System.out.println(emailToCountryMap);

        /**
         * Получить Map email / покупатель
         */
        Map<String, String> emailToCustomerMap = new HashMap<>();
        for (Customer customer : customers) {
            emailToCustomerMap.put(customer.getEmail(), customer.getName());
        }
        System.out.println(emailToCustomerMap);

        /**
         *  Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email
         */
        Map<Boolean,Integer> emailConfirmedCount = new HashMap<>();
        emailConfirmedCount.put(true,0);
        emailConfirmedCount.put(false, 0);
        System.out.println(emailConfirmedCount);

        for (Customer customer : customers) {
            boolean isConfirmed = customer.isEmailConfirmed();
            int count = emailConfirmedCount.get(isConfirmed);
            emailConfirmedCount.put(isConfirmed, count + 1);
        }
        System.out.println("Количество подтвержденных email: " + emailConfirmedCount.get(true));
        System.out.println("Количество неподтвержденных email: " + emailConfirmedCount.get(false));

        /**
         * . Получить Map> страна / список покупателей из данной страны
         */

        Map<String, List<Customer>> countryCustomersMap = new HashMap<>();
        for (Customer customer :customers) {
            String country = customer.getCountry();
            List<Customer> countryCustomers = countryCustomersMap.getOrDefault(country, new ArrayList<>());
            countryCustomers.add(customer);
            countryCustomersMap.put(country,countryCustomers);
        }
        System.out.println(countryCustomersMap);

        /**
         * Получить Map страна / суммарный накопленный бонус покупателей из данной страны
         */
        Map<String,Integer> countryTotalBonusMap = new HashMap<>();
        for (Customer customer : customers) {
            String country = customer.getCountry();
            int bonusAmount = customer.getBonusAmount();
            int totalBonus = countryTotalBonusMap.getOrDefault(country,0);
            totalBonus += bonusAmount;
            countryTotalBonusMap.put(country,totalBonus);
        }
        System.out.println(countryTotalBonusMap);

        /**
         * Добавить для класса Customer возможность добавления в качестве ключа в TreeMap, HashMap.
         * Проверить, правильно ли добавляется.
         */
    }
}
