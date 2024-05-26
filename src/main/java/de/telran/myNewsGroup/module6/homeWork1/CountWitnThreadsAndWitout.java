package de.telran.myNewsGroup.module6.homeWork1;

public class CountWitnThreadsAndWitout {
    /**
     * : посчитать количество целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
     * которые делятся на заданное целое число без остатка.
     * Решить данную задачу последовательно и параллельно в нескольких потоках. Сравнить время выполнения.
     */

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int number = 5;
        ParalielThreads.Task task1 = new ParalielThreads.Task(Integer.MIN_VALUE, -500_000_000, number);
        ParalielThreads.Task task2 = new ParalielThreads.Task(-500_000_000, 1_000_000_000,number);
        ParalielThreads.Task task3 = new ParalielThreads.Task(1_000_000_000,2_000_000_000, number);
        ParalielThreads.Task task4 = new ParalielThreads.Task(2_000_000_000 , Integer.MAX_VALUE, number);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int totalCount = task1.count + task2.count + task3.count + task4.count;

        long end = System.currentTimeMillis();

        System.out.println("Total numbner of numbers divisible by " + number + " is " + totalCount );

        System.out.println("Elapsed time: " + (end - start));
    }
}
