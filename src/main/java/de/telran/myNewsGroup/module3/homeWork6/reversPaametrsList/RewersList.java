package de.telran.myNewsGroup.module3.homeWork6.reversPaametrsList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RewersList {
    /**
     *
     Написать метод,
     который принимает список любого типа и возвращает его в виде нового списка с элементами в обратном порядке
     */
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println(rewerseList(integerList));

        List<String> stringList = Arrays.asList("One","Two","Three");
        System.out.println(rewerseList(stringList));
    }
    public static <T> List<T> rewerseList(List<T> list){
        List<T> rewersListStream = list.stream()
                .collect(Collectors.toList());

         Collections.reverse(rewersListStream);
         return rewersListStream;
    }
}
