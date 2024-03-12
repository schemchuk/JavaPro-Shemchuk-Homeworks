package de.telran.myNewsGroup.module2.homeWork1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExsampleListiterator {
    /**
     * С помощью listIterator:
     * c). Удалить из списка все имена, начинающиеся на "T"
     * d). Заменить в списке "Ann" на "student Ann"
     */
    public static void main(String[] args) {

        //List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

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

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element != null && element.startsWith("T")) {
                iterator.remove();
            }
        }

        System.out.println(names);

        System.out.println("-------------------------------");

         iterator = names.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element != null && element.equals("Ann")) {
                iterator.set("student Ann");
            }
        }

        System.out.println(names);
    }
}
