package de.telran.myNewsGroup.module6.homeWork3;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class RunnersWithBridgeTask {
    // Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
    // Каждый бегун земеряет свой результат и сообщает его тренеру. В конце забега выводится информация о победителе.
    // Реализовать данную модель с помощью запуска отдельных потоков. Бегуна представить через класс Runner implements Runnable.

    private static ConcurrentHashMap<String, Long> results = new ConcurrentHashMap<>();
    private static Object bridge = new Object();


    public static void main(String[] args) {



        Runner runner1 = new Runner("Opanas");
        Runner runner2 = new Runner("Shlema");
        Runner runner3 = new Runner("Hryz");

        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String winner = results.entrySet().stream()
                .min((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                .get()
                .getKey();

        System.out.println("Победитель: "  + winner);
    }

    static class Runner implements Runnable {

        private String name;

        public Runner(String nane) {
            this.name = nane;
        }

        @Override
        public void run() {
            Random random = new Random();
            try {
                long startTime = System.currentTimeMillis();
                System.out.println("Стартует участник под номером " + Thread.currentThread().getName() + " " +name);
                Thread.sleep(4_000 + random.nextInt(4_000));
                System.out.println("Участник под номером " + Thread.currentThread().getName() + " " +name + " подбежал к мосту и ждет своей очереди");

                synchronized (bridge) {
                    System.out.println("Участник под номером " + Thread.currentThread().getName() + " " +name + " забегает на мост");
                    Thread.sleep(2_000 + random.nextInt(1_000));
                    System.out.println("Участник под номером " + Thread.currentThread().getName() + " " +name + " одолевает мост и бежит к финишу");

                }
                Thread.sleep(6_000 + random.nextInt(6_000));

                System.out.println("Финиширует участник под номером " + Thread.currentThread().getName() + " " + name);

                long endTime = System.currentTimeMillis();
                long runnerResult = endTime - startTime;
                results.put(name, runnerResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       }
    }
}
