package de.telran.myNewsGroup.module2.homeWork4.point;

import java.util.*;

public class SimplCollektions {
    public static void main(String[] args) {
        /**
         * Создать список точек, отсортировать по координате y.
         */

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(2,5));
        pointList.add(new Point(5,7));
        pointList.add(new Point(9,2));
        pointList.add(new Point(1,2));
        pointList.add(new Point(8,1));
        pointList.add(new Point(4,9));

        Collections.sort(pointList);
        System.out.println("Сортированный список точек по координате y: ");
        for (Point p : pointList) {
            System.out.println(p);
        }
        System.out.println("-----------");

        /**
         * Создать TreeSet со всеми уникальными точками.
         */

        TreeSet<Point> treeSet = new TreeSet<>();
        treeSet.add(new Point(2,5));
        treeSet.add(new Point(5,7));
        treeSet.add(new Point(9,2));
        treeSet.add(new Point(1,2));
        treeSet.add(new Point(2,2));
        treeSet.add(new Point(3,2));
        treeSet.add(new Point(8,1));
        treeSet.add(new Point(4,9));

        for (Point p : treeSet) {
            System.out.println(p);
        }

        System.out.println("-------------");

        /**
         * Создать TreeSet со всеми различными по координате y точками.
         */

        //если реализованный в классе Point интерфейс Comparable не подходит для выполнения
        // задачи, используем интерфейс Comparator

        Comparator<Point> yComparator = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getY(),o2.getY());
            }
        };
        TreeSet<Point> uniquePointByY = new TreeSet<>(yComparator);

        uniquePointByY.add(new Point(2,5));
        uniquePointByY.add(new Point(5,7));
        uniquePointByY.add(new Point(9,2));
        uniquePointByY.add(new Point(1,2));
        uniquePointByY.add(new Point(2,2));
        uniquePointByY.add(new Point(3,2));
        uniquePointByY.add(new Point(8,1));
        uniquePointByY.add(new Point(4,9));

        for (Point p : uniquePointByY) {
            System.out.println(p);
        }

    }
}
