package de.telran.myNewsGroup.module3.homeWork4;

import java.util.ArrayList;
import java.util.List;

/**
 * Переписать через стримы фрагменты кода:
 */
public class Exsample2 {
    public static void main(String[] args) {
        List<String> strings = List.of("One","Two","Three");
        for (String s : strings) {
            System.out.println(s);
        }
        strings.stream()
                .forEach(System.out::println);

        //method
        System.out.println(method(List.of("Opanas", "Salomon", "Tom", "Omelyan", "tom", "Havrusha", "Salomon", "Omelyan", "Hryz", "Benya", "Tom")));

        //methodStream

        System.out.println(methodStream(List.of("Opanas", "Salomon", "Tom", "Omelyan", "tom", "Havrusha", "Salomon", "Omelyan", "Hryz", "Benya", "Tom")));
    }

    public static List<String> method(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static List<String> methodStream(List<String> strings){

        return strings.stream()
               // .filter(s -> s.contains(s))
                .distinct()
                .toList();

    }


}
