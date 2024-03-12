package de.telran.myNewsGroup.module2.homeWork1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {

        /**
         * Имеется заданный список имен студентов:
         * List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
         * С помощью итератора:
         * Удалить из списка names все строки, содержащие 4 символа.
         */


        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Jane");
        names.add("Tom");
        names.add(null);
        names.add("Tim");
        names.add("Mark");
        names.add("Ann");
        names.add(null);
        names.add("");
        names.add("Omeljan");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element != null && element.length() ==4) {
                iterator.remove();
            }
        }
        System.out.println(names);

        System.out.println("----------------------");

        /**
         *С помощью итератора:
         * b). Удалить из списка null и пустые строки.
         */

        iterator = names.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element == null || element.length() == 0 ) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
