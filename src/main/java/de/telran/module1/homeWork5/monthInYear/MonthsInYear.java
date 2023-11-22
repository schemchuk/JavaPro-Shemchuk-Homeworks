package de.telran.module1.homeWork5.monthInYear;

public enum MonthsInYear {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь"),
    NEW_NASA_MONTH("Пупень");

    private String title;
    public String getTitle() {
        return title;
    }

    MonthsInYear(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MonthsInYear{}";
    }
}
