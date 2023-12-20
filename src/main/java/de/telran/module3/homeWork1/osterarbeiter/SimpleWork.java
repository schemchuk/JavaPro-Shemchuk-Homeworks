package de.telran.module3.homeWork1.osterarbeiter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
public class SimpleWork {
    public static void main(String[] args) {
        List<Supplier<String>> tasks = new ArrayList<>();
        //Основные обязанности
        tasks.add(() -> "Замешать раствор");
        tasks.add(() -> "Подать стройматериалы");
        tasks.add(() -> "Подать раствор");

        // Изменение задачи в любое время
        tasks.add(() -> "Красить стены");
        tasks.add(() -> "Принеси не знаю чего");
        // Начать рабочий день
        startWorking(tasks);
    }

    private static void startWorking(List<Supplier<String>> tasks) {
        System.out.println("Подсобник начинает рабочий день:");
        tasks.forEach(task -> {
            String result = task.get();
            System.out.println("Выполнено: " + result);
        });
    }
}
