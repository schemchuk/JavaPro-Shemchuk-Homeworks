package de.telran.myNewsGroup.module2.homeWork5;

import java.util.HashSet;
import java.util.Set;

public class ContainsTwoSets {
    public static void main(String[] args) {
        Set<String>  set1 = new HashSet<>();
        Set<String>  set2 = new HashSet<>();

        set1.add("aa");
        set1.add("bb");
        set1.add("jj");
        set1.add("kk");

        set2.add("cc");
        set2.add("dd");
        set2.add("jj");
        set2.add("kk");

        /**
         *  Имеется два набора элементов Set. Создать Set, в котором бы находились:
         * все элементы из двух наборов,
         */
        Set<String> combySet =new HashSet<>(set1);
        combySet.addAll(set2);
        System.out.println("Объединенный набор: " + combySet);

        /**
         * Имеется два набора элементов Set. Создать Set, в котором бы находились:
         * только общие для двух наборов элементы,
         */
        Set<String> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);
        System.out.println("Набор общих элементов: " + commonSet);

        /**
         *  Имеется два набора элементов Set. Создать Set, в котором бы находились:
         * только элементы, которые присутствуют в первом наборе и отсутствуют во втором
         */
        Set<String> exlusivSet = new HashSet<>(set1);
        exlusivSet.removeAll(set2);
        System.out.println("Набор ексклюзивных елементов первого сета : " + exlusivSet);

    }
}
