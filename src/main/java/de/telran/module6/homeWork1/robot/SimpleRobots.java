package de.telran.module6.homeWork1.robot;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class SimpleRobots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество деталей: ");
        int totalDetails = scanner.nextInt();

        Semaphore semaphore = new Semaphore(1);

        Robots.Robot1 robot1 = new Robots.Robot1(semaphore, totalDetails);
        Robots.Robot2 robot2 = new Robots.Robot2(semaphore, totalDetails);

        robot1.start();
        robot2.start();

        try {
            robot1.join();
            robot2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Производство завершено.");
    }
}