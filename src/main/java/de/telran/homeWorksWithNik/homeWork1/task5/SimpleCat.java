package de.telran.homeWorksWithNik.homeWork1.task5;

public class SimpleCat {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        Cat kitten = Cat.Loader.getKitten();
        System.out.println("Вес котенка: " + kitten.getWeight());

    }
}


