package de.telran.homeWorks_22_08.module1.homework4.pizza;

public class Pizza {

    private static final double BASIC_CALORIES_PER_SQUARE_CM = 40;
    public double calculateCalories(String shape, double a, double b) {
        double calcResult = 0;

        switch (shape) {
            case "square":
                calcResult = calculateSquarePizzaCalories(a);
                break;
            case "rectangle":
                calcResult = calculateRectanglePizzaCalories(a, b);
                break;
            case "circle":
                calcResult = calculateCirclePizzaCalories(a);
                break;
            default:
                System.out.println("Мы не умеем делать пиццу такой формы: " + shape);
        }

        return calcResult;
    }

    private double calculateSquarePizzaCalories(double a) {
        double calcResult = BASIC_CALORIES_PER_SQUARE_CM * Math.pow(a, 2);
        System.out.println("Квадратная пицца со стороной: " + a + " имеет калорийность " + calcResult);
        return calcResult;
    }

    private double calculateRectanglePizzaCalories(double a, double b) {
        double calcResult = BASIC_CALORIES_PER_SQUARE_CM * a * b;
        System.out.println("Прямоугольная пицца со стороной: " + a + " и стороной " + b + " имеет калорийность " + calcResult);
        return calcResult;
    }

    private double calculateCirclePizzaCalories(double r) {
        double calcResult = BASIC_CALORIES_PER_SQUARE_CM * 3.14 * Math.pow(r, 2);
        System.out.println("Круглая пицца с радиусом: " + r + " имеет калорийность " + calcResult);
        return calcResult;
    }
}
// для работы с гитом
