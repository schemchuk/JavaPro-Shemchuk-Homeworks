package de.telran.homeWorks_22_08.module1.module5.homeWork1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleEmail {
    public static void main(String[] args) {
        //  [A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4};
        // Проверяем правильность шаблона
        System.out.println("myemail@gmail.com".matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}"));
        // Находим индекс входа
        Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}");
        Matcher m = p.matcher("My email is myemail@gmail.com");

        while (m.find()){
            System.out.println(m.start() + " " + m.group() );
        }
    }
}
