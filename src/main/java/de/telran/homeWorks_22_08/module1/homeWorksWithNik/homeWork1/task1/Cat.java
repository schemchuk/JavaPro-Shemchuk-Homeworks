package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task1;

public class Cat {
    private double weight;
    private boolean alive;


    public Cat() {
    }

    public Cat(double weight, boolean alive) {
        this.weight = weight;
        this.alive = alive;

    }

    public void printCatWeight() {
        System.out.println("Вес кошки: " + weight);
    }

    public void feed() {
        if (alive) {
            weight += 0.1;
            System.out.println("Кошка поела. Теперь ее вес: " + weight);
        } else  {
            System.out.println("Кошка умерла. Больше есть не будет");
        }
    }

    public void meowToDeath() {
        while (alive) {
            System.out.println("Мяу!");
            weight -= 0.1;
            System.out.println("Вес кошки стал: " + weight);
            if (weight <= 0) {
                alive = false;
                System.out.println("Кощка умерла от изнеможения.");
            }
        }
    }
}
