package de.telran.homeWorks_22_08.module1.module4.homeWork1.util;

public class SimpleUtil {
    public static void main(String[] args) {

        UtilClass<Integer, Integer> util1 = new UtilClass<>();

        System.out.println("Сумма  двух интеджеров: " + util1.add(5,8));
        System.out.println("Вычитание двух интеджеров: " + util1.sub(5, 8));
        System.out.println("Умножение двух интеджеров: " + util1.mult(5, 8));
        System.out.println("Деление двух интеджеров: " + util1.div(5,8));
        //System.out.println("Деление двух интеджеров: " + util1.div(5, 0));
        System.out.println("Возведение в степень интеджера: " + util1.sqr(5));

        UtilClass<Double, Double> util2 = new UtilClass<>();

        System.out.println("Сумма  двух даблов: " + util2.add(5.3, 8.2));
        System.out.println("Вычитание двух даблов: " + util2.sub(5.3, 8.2));
        System.out.println("Умножение двух даблов: " + util2.mult(5.3, 8.2));
        System.out.println("Деление двух даблов: " + util2.div(5.3, 8.2));
        //System.out.println("Деление двух даблов: " + util2.div(5.3, 0.0));
        System.out.println("Возведение в степень даблa: " + util2.sqr(5.3));

        UtilClass<Integer, Double> util3 = new UtilClass<>();

        System.out.println("Сумма  двух типов: " + util3.add(5, 8.2));
        System.out.println("Вычитание двух типов:: " + util3.sub(5, 8.2));
        System.out.println("Умножение двух типов:: " + util3.mult(5, 8.2));
        System.out.println("Деление двух типов:: " + util3.div(5, 8.2));
        //System.out.println("Деление двух типов:: " + util3.div(5, 0.0));
    }
}
