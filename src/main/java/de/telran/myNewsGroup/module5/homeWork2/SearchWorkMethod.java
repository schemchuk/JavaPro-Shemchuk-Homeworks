package de.telran.myNewsGroup.module5.homeWork2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWorkMethod {
    /**
     * Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
     */
    public void regSearchWork(String inputString, String regEx) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println("Найдено совпадение: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        SearchWorkMethod myMethod = new SearchWorkMethod();

        String inputString = "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo.";

        String regEx = "[B][a-z]*";
        System.out.println("Слова, начинающиеся на большую  'B' буквы:");
        myMethod.regSearchWork(inputString, regEx);
    }
    }

