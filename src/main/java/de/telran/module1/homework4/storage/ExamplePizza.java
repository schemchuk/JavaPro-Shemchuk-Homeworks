package de.telran.module1.homework4.storage;

import de.telran.module1.homework4.pizza.Pizza;

public class ExamplePizza {
    public static void main(String[] args) {

        Pizza pizzaCalculator = new Pizza();

        double squareCalories = pizzaCalculator.calculateCalories("square", 20.0, 0.0);
        double rectangleCalories = pizzaCalculator.calculateCalories("rectangle", 20.0, 25.0);
        double circleCalories = pizzaCalculator.calculateCalories("circle", 20.0, 0.0);
        double pentagramCalories = pizzaCalculator.calculateCalories("pentagram", 20.0 , 30.0);

    }
}
