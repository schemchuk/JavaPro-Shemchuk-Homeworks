package de.telran.module1.homeWork5.monthInYear;

public class SimpleEnum {
    public static void main(String[] args) {
        MonthsInYear month1 = MonthsInYear.JANUARY;
        MonthsInYear month2 = MonthsInYear.FEBRUARY;
        MonthsInYear month3 = MonthsInYear.MARCH;
        MonthsInYear month4 = MonthsInYear.APRIL;
        MonthsInYear month5 = MonthsInYear.MAY;
        MonthsInYear month6 = MonthsInYear.JULY;
        MonthsInYear month7 = MonthsInYear.JUNE;
        MonthsInYear month8 = MonthsInYear.AUGUST;
        MonthsInYear month9 = MonthsInYear.SEPTEMBER;
        MonthsInYear month10 = MonthsInYear.OCTOBER;
        MonthsInYear month11 = MonthsInYear.NOVEMBER;
        MonthsInYear month12 = MonthsInYear.DECEMBER;
        MonthsInYear month13 = MonthsInYear.NEW_NASA_MONTH;

        WhatWillWeDrink whatWillWeDrink = new WhatWillWeDrink(MonthsInYear.NEW_NASA_MONTH);


        if(whatWillWeDrink.determineSeason().equals("Winter")) {
            System.out.println("Drink Rom");
        } else if (whatWillWeDrink.determineSeason().equals("Spring")) {
            System.out.println("Drink wine");
        } else if (whatWillWeDrink.determineSeason().equals("Summer")) {
            System.out.println("Drink beer");
        } else if (whatWillWeDrink.determineSeason().equals("Autumn")) {
            System.out.println("Drink whiskey");
        } else {
            System.out.println("Это сомнительный месяц придуман недавно. Не пей алкогольных напитков");
        }
    }
}
