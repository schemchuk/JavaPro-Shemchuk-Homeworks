package de.telran.module1.homeWork5.monthInYear;

public class WhatWillWeDrink {
    private MonthsInYear months;


    public MonthsInYear getMonths() {
        return months;
    }

    public void setMonths(MonthsInYear months) {
        this.months = months;
    }

    public WhatWillWeDrink(MonthsInYear months) {
        this.months = months;
    }

    public String determineSeason() {
        switch (months) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return  "Winter";
            case MARCH:
            case APRIL:
            case MAY:
                return "Spring";
            case JUNE:
            case JULY:
            case AUGUST:
                return "Summer";
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return "Autumn";
            default:
                return "Наверное это тринадцатый месяц от NASA";
        }

    }
}
