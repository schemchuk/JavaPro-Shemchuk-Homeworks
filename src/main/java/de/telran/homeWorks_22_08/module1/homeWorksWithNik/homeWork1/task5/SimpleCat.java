package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task5;

public class SimpleCat {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        Cat kitten = Cat.Loader.getKitten();
        System.out.println("Вес котенка: " + kitten.getWeight());

    }
}


