package de.telran.myNewsGroup.module5.homeWork2;

public class CorrectText {
    /**
     * Имеется текст "Php is the best programming language in the world. I study php." Замените в нем php на java.
     */

    public static void main(String[] args) {
        String string = "Php is the best programming language in the world. I study php.";
        String redex = string.toLowerCase().replaceAll("php" , "java");
        System.out.println(redex);

        /**
         * Имеется некоторый текст. Найти и вывести из него все группы гласных, стоящие вместе.
         * Например: a, ua, uiy
         */
        String string1 = "";

    }
}
