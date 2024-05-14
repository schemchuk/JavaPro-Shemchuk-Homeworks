package de.telran.myNewsGroup.module5;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleLessonStartTimes {
    /**
     * Составить список времен начала всех занятий по Java за июнь, если предположить,
     * что они будут проходить каждый понедельник/среду c 9:30 CET.
     * @param args
     */
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, Month.JUNE, 1);
        LocalDate endDate = LocalDate.of(2024, Month.JUNE, 30);

        List<LocalDateTime> lessonTimes = new ArrayList<>();

        startDate.datesUntil(endDate.plusDays(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.MONDAY || date.getDayOfWeek() == DayOfWeek.WEDNESDAY)
                .forEach(date -> {
                    LocalDateTime lessonStart = LocalDateTime.of(date, LocalTime.of(9, 30))
                            .atZone(ZoneId.of("CET"))
                            .toLocalDateTime();
                    lessonTimes.add(lessonStart);
                });


        System.out.println("Дни и начало занятий по джаве в группе  на июнь: ");
        for (LocalDateTime lessonTime :lessonTimes) {
            System.out.println(lessonTime);
        }
    }

}
