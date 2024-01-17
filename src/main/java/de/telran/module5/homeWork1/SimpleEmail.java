package de.telran.module5.homeWork1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleEmail {
    public static void main(String[] args) {
        //  "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}\\b"));
        // Проверяем правильность шаблона
        System.out.println("myemail@gmail.com".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}\\b"));
        // Находим индекс входа
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("My email is myemail@gmail.com");

        while (m.find()){
            System.out.println(m.start() + " " + m.group() );
        }
    }
}
