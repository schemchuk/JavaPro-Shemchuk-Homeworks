package de.telran.myNewsGroup.module3.HomeWork5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleOptional {
    /**
     * . List<Optional<String>> list = Arrays.asList(Optional.of("A"), Optional.of("B"), Optional.empty());
     * Преобразовать в List<String>
     */
    public static void main(String[] args) {
        List<Optional<String>> list = Arrays.asList(Optional.of("A"), Optional.of("B"), Optional.empty());

        List<String> stringList = list.stream()
                .flatMap(Optional::stream)
                .toList();
        System.out.println(stringList);
    }
}
