package de.telran.javaPro.summary.work_24_03_15.works;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Box implements Iterable<String> {
//    2. Имеется класс Box
//public class Box {
//    String itemA;
//    String itemB;
//    String itemC;
//}
//Реализовать для него итератор.

    String itemA;
    String itemB;
    String itemC;


    public Box(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }


    @Override
    public String toString() {
        return "Box{" +
                "itemA='" + itemA + '\'' +
                ", itemB='" + itemB + '\'' +
                ", itemC='" + itemC + '\'' +
                '}';
    }

    @Override
    public Iterator<String> iterator() {
        return new BoxIterator();
    }

    private class BoxIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < 3;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No such element");
            }
                String nextItem = null;
                switch (currentIndex) {
                    case 0:
                        nextItem = itemA;
                        break;
                    case 1:
                        nextItem = itemB;
                        break;
                    case 2:
                        nextItem = itemC;
                        break;
                }
                currentIndex++;
                return nextItem;
            }
        }
    }

