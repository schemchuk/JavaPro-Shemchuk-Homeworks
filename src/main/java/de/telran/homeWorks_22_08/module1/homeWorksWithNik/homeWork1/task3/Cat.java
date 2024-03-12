package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task3;


import de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task4.CatConst;

public class Cat extends CatConst {

    private double weight;
    private static int count = 0;
    double sumWeigth = 0;


    private  boolean isAlive;


    public boolean isAlive() {

        return isAlive;
    }

    public Cat(double weight, boolean isAlive) {
        this.weight = weight;
        this.isAlive = weight > 0;
        if (isAlive) {
            count++;
        }
    }

    public static  int getCount() {
        return count;
    }

    public void feed(double foodWeight) {
        if (isAlive()) {
            sumWeigth += foodWeight;
            if (sumWeigth >= 1.0) {
                explode();
            }
        } else  {
            System.out.println("Мертвая кошка не хочет кушать");
        }
    }

    public void pee() {
        if (isAlive) {
            System.out.println("Кошка сходила в туалет");
            weight -= 0.1;
        } else {
            System.out.println("мертвая кошка не хочет в туалет");
        }
    }

    private void explode() {
        System.out.println("Кошка взорвалась!");
        isAlive = false;
        count--;
    }
}
