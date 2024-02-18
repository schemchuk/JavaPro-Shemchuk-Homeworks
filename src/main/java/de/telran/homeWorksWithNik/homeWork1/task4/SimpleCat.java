package de.telran.homeWorksWithNik.homeWork1.task4;

public class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2.2, true,CatColor.GRAY);
        Cat cat2 = new Cat(3.5, true,CatColor.BLACK);
        Cat cat3 = new Cat(5.5, false,CatColor.MIXED);
        System.out.println("Количество живых кошек: " + Cat.getCount());

        cat1.feed(0.3);
        cat2.feed(0.3);
        cat1.pee();
        cat1.feed(0.2);
        cat1.feed(0.6);
        System.out.println("Количество живых кошек: " + Cat.getCount());
    }
}

//Константы и Enum
//Создать у кошки константы: “количество глаз”, “минимальный вес” и “максимальный вес”.
//Создать enum с окрасами кошек.
