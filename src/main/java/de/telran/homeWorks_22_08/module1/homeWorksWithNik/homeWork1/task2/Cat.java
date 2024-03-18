package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task2;

public interface Cat {

        // Метод для вывода веса кошки в консоль
        void printWeight();

        // Метод для кормления кошки
        void feed();

        // Метод для проверки, находится ли кошка в живом состоянии
        boolean isAlive();
    // Метод, который возвращает сумму съеденной еды текущей кошки
    public void eat(double foodWeight);

        // Метод для "замяукивания" кошки до смерти
        void meowToDeath();

        // Метод для возвращения веса кошки
        double getWeight();

        // Метод для установки веса кошки
        void setWeight(double weight);


    // Метод для возвращения суммы съеденной еды текущей кошки
    double getEatenFood();

    // Метод для "сходить в туалет"
    void pee();
    }


