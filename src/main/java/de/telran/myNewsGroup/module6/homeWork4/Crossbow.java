package de.telran.myNewsGroup.module6.homeWork4;

import java.util.Random;
import java.util.Scanner;

public class Crossbow {
    /**
     * Арбалет. См. класс Crossbow в репозитории.
     * Стрелок robinHood в одном потоке стреляет из арбалета,
     * его помощник servant в другом потоке приносит ему колчан, когда стрелы закончатся.
     * Заготовка логики в классе Crossbow. Доработать логику, чтобы:
     * <p>
     * <p>
     * стрельба продолжалась бесконечно
     * <p>
     * количество приносимых стрел каждый раз определял бы пользователь, вводя число arrows через консоль
     */
   private  String name;
    private int arrows;
    private final Object lock = new Object();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // When the arrows end, the wait() method is called and releases.
    public void fire() {
        while (true) {
            synchronized (lock) {
                System.out.println("Смотри куда стреляешь");
                    arrows--;
                try {
                    Thread.sleep(random.nextInt(1000, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("проверить боезапас " + arrows + " в наличии");
                if (arrows == 0) {
                    System.out.println("Помощник, давай  еще стрелы");
                }

                while (arrows == 0) {

                    System.out.println("Помощник ищет пополнение боезапаса");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

    public void reload() {


        while (true) {
            if (arrows == 0) {
                System.out.println("Камандир, стрелку " + name + "нужны стрелы. Отсыпь маленько (ввести количество)");
                int takeArroys = scanner.nextInt();


                synchronized (lock) {
                    arrows += takeArroys;
                    System.out.println("О! Начальство отсыпало " + arrows + " cтрел");
                    lock.notify();
                }
            }

            try {
                Thread.sleep(random.nextInt(5_000, 8_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Crossbow crossbow = new Crossbow();
        Scanner scanner1 = new Scanner(System.in);
        Random random1 = new Random();
        System.out.println("Введите начальное число стрел у стрелка");
        crossbow.arrows = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите имя стрелка");
        crossbow.name = scanner2.nextLine();

        System.out.println("Стрелок " + crossbow.name + " получил " +  crossbow.arrows + " cтрел");
        try {
            Thread.sleep(random1.nextInt(4000, 6000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Стрелок " + crossbow.name + " к стрельбе готов");

        System.out.println("Начинай уже");
        try {
            Thread.sleep(random1.nextInt(3000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread robinHood = new Thread(crossbow::fire);
        Thread servant = new Thread(crossbow::reload);

        robinHood.start();
        servant.start();
    }
}