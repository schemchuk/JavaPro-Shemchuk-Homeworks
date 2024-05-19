package de.telran.myNewsGroup.module5.homeWork2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFohneMethod {
    /**
     *  Имеется некоторый текст. Найти и вывести из него все группы гласных, стоящие вместе. Например: a, ua, uiy
     */
    public void regSearchWork(String inputString, String regEx) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println("Найдено совпадение: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        SearchFohneMethod myMethod = new SearchFohneMethod();

        String inputString = "BuffaloBoeuffaAbiEeI";

        String regEx = "[aeiouAEIOU]+";
        System.out.println("встречающиеся группы гласных: ");
        myMethod.regSearchWork(inputString, regEx);
    }
    }

