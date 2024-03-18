package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task2;

public class CatExempl extends CatAbstract {
    private double eatFoodWeight;


    @Override
    public void eat(double foodWeight) {
        eatFoodWeight += foodWeight;
    }

    @Override
    public double getEatenFood() {
        return eatFoodWeight;
    }

    @Override
    public void pee() {
        System.out.println("Кошка сходила в туалет");
        double catFitnes = 50.0;
        if (eatFoodWeight >= catFitnes) {
            eatFoodWeight -= catFitnes;
        } else {
            eatFoodWeight = 0;
        }
    }
}



