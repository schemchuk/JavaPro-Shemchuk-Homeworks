package de.telran.javaPro.summary.work_24_03_15.works;
//    3. Имеется класс SquareArrayList, данные в котором хранятся в двумерном массиве
//    public class SquareArrayList {
//        private int[][] data;
//Реализовать для него итератор.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SquareArrayList implements Iterable<Integer>{
    private int[][] data;

    public SquareArrayList(int[][] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SquareArrayListIterator();
    }

    public class SquareArrayListIterator implements Iterator<Integer>{
        int line = 0;
        int colunm = 0;

        @Override
        public boolean hasNext() {

            return line < data.length && colunm < data.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int item = data[line][colunm];
            if (colunm > data[line].length){
                colunm = 0;
                line++;
            }
            return item;
        }
    }

    public static void main(String[] args) {

    }

}
