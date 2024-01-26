package de.telran.module6.homeWork1;
import java.util.Scanner;
import java.util.Scanner;

public class ExampleMulti {
    public static void main(String[] args) {
        System.out.println("Write number of threads: ");
        int numThreads = getUserInput();

        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new NumberedThread(i);
            thread.start();
        }

        try {
            for (int i = 1; i <= numThreads; i++) {
                Thread thread = getThreadByName("Thread number: " + i);
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads are completed. Main thread is completed.");
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static Thread getThreadByName(String name) {
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    static class NumberedThread extends Thread {
        private final int threadNumber;

        NumberedThread(int threadNumber) {
            this.threadNumber = threadNumber;
            setName("Thread number: " + threadNumber);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread " + threadNumber + ": Iteration " + (i + 1));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread " + threadNumber + " completes execution.");
        }
    }
}


//Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное введенной цифре,
//нумеруете их и запускаете на выполнение. Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100
//миллисекунд перед каждым выводом. Сделайте так, чтобы главный поток выполнения программы не завершился до окончания
//работы всех дочерних потоков.
