package de.telran.myNewsGroup.module5.homeWork1;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.TimeZone;

public class FlightCalculator {
    /**
     * Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
     * Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.
     */
    public static void main(String[] args) {
        LocalTime departureTime = LocalTime.of(15, 5);
        int durationHours = 10;
        int durationMinutes = 50;

        LocalTime arrivalTime = calculateFlightTime(departureTime, durationHours,durationMinutes);

        System.out.println("Time of arrival at Frankfurt: " + arrivalTime);

    }

    public static LocalTime calculateFlightTime(LocalTime departureTime, int durationHours, int durationMinutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, departureTime.getHour());
        calendar.set(Calendar.MINUTE, departureTime.getMinute());
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

        calendar.add(Calendar.HOUR_OF_DAY, durationHours);
        calendar.add(Calendar.MINUTE, durationMinutes);

        int arrivalHour = calendar.get(Calendar.HOUR_OF_DAY);
        int arrivalMinute = calendar.get(Calendar.MINUTE);

        return LocalTime.of(arrivalHour, arrivalMinute);
    }

}
