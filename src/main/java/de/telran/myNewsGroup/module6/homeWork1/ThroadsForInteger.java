package de.telran.myNewsGroup.module6.homeWork1;

public class ThroadsForInteger {
    /**
     * : посчитать количество целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
     * которые делятся на заданное целое число без остатка.
     * Решить данную задачу последовательно и параллельно в нескольких потоках. Сравнить время выполнения.
     */

    public static void main(String[] args) {

        System.out.println(numberDivInteger(5));

    }

    public static int numberDivInteger(int number) {
        if (number == 0) {
            throw new ArithmeticException("Division by zero");
        }
        long start = System.currentTimeMillis();
        int count = 0;

        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (i % number == 0) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
        return count;
    }
}
