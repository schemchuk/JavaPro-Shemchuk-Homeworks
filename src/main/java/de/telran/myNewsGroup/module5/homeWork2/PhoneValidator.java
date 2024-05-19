package de.telran.myNewsGroup.module5.homeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    /**
     * Напишите регулярное выражение, которое соответствует любому номеру телефона согласно формату:
     * телефонный номер состоит из 7 цифр подряд или из 3х цифр, пробела или тире,
     * а затем из 4 цифр (1234567, 123-4567, 123 4567).
     */
    public static <TelNumber> void main(String[] args) {
        String redex = "\\d{3}[-\\s]?\\d{4}";
        Pattern pattern = Pattern.compile(redex);

        List<String> telNumberList = new ArrayList<>();
        telNumberList.add("1234567");
        telNumberList.add("123 4567");
        telNumberList.add("123-4567");
        telNumberList.add("123 45678");
        telNumberList.add("1238 4567");
        telNumberList.add("+123 4567");

        for(String telNumber : telNumberList) {
            Matcher matcher = pattern.matcher(telNumber);
            if (matcher.matches()) {
                System.out.println(telNumber + " is correct.");
            } else {
                System.out.println(telNumber + " is not correct.");
            }
        }


    }
}
