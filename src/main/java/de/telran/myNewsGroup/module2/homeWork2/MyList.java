package de.telran.myNewsGroup.module2.homeWork2;

import java.util.LinkedList;

public class MyList {

    public String findShortString(LinkedList<String> linkedList) {
        if (linkedList.isEmpty()) {
            return null;
        }
        String shortString = linkedList.get(0);

        for (String str : linkedList) {
            if (str.length() < shortString.length()) {
                shortString = str;
            }
        }
        return shortString;
    }

    public String combinateTerms(LinkedList<String> linkedList) {
        if (linkedList.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();

        for (String str : linkedList) {
            result.append(str).append("|");
        }
        return result.toString();
    }
}
